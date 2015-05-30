package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class proj_euler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	long start_time= System.currentTimeMillis();
		for(int i = 0; i < 999; i++){
			one();
		}
		System.out.println(System.currentTimeMillis()- start_time);
		
		
		start_time= System.currentTimeMillis();
		for(int i = 0; i < 999; i++){
			one_other();
		}
		System.out.println(System.currentTimeMillis() - start_time);*/
		
		//two();
		
		System.out.println(three());
		
	}
	public static int one(){
		int sum = 0;
		for (int i =0; i < 1000; i++){
			if (i%3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		return sum;
	}
	
	public static int one_other(){
		int sum = 0; 
		for(int i = 0; i <1000; i++){
			if (i % 3 != 0 && i % 5 != 0){
				continue;
			}
			sum += i;	
		}
		return sum;
	}

	public static int two(){
		int sum = 0;
		int numOne = 1;
		int numTwo = 1;
		int num = 0;
		while(num < 4000000){
			num = numOne + numTwo;
			numOne = numTwo;
			numTwo = num;
			if(num % 2 == 0) {
				sum = sum + num;
			}			
		}
		return sum;
	}

	public static long three(){
		long bigPup = 600851475143L;
		int num = 0;
		for(int i = 1; i < bigPup; i+=2){
			System.out.println(i);
			if(bigPup % i == 0){
				num = i;
				System.out.println(i);
			}
		}
		System.out.println(num);
		return num;
	}
}
