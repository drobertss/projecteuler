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
			one_slow();
		}
		System.out.println(System.currentTimeMillis() - start_time);*/

		//two();

		//	three();

		//four();

		//	System.out.println(five());

		//	System.out.println(six());
		//long start_time= System.currentTimeMillis();
		//seven();
		//System.out.println(System.currentTimeMillis() - start_time);

	}

	
	
	
	//What is the 10 001st prime number?
	public static long seven(){
		int counter = 0;
		long num = 2;
		long prime =2;

		while(counter != 10000){
			if(prime(num)){

				counter++;
				prime=num;
				if(counter==10000){
					return prime;
				}
				num++;	
			}
			num++;
		}
		return prime;
	}

	/*Find the difference between the sum of the squares of the 
	 * first one hundred natural numbers and the square of the sum.
	 */
	public static int six(){
		int sumOfSq = 0;
		int squareOfSum = 0;
		int difference;

		for(int i =1; i<101; i ++){

			sumOfSq = sumOfSq + (i * i);
			squareOfSum = squareOfSum + i;

		}
		squareOfSum = squareOfSum * squareOfSum;

		difference = squareOfSum - sumOfSq;

		return difference;

	}

	/*What is the smallest positive number that is evenly divisible 
	 * by all of the numbers from 1 to 20?*/
	public static int five(){
		int max = 21;
		int num = 1;
		int prevNum = 9999999;
		boolean run = true;
		System.out.println("here we go");
		for(int i = max; i < 999999999; i++){
			//	System.out.println("i is equal to " + i );

			//System.out.println("--------- i equals ========-= " + i);
			for(int x = 1; x<max; x++){
				//System.out.println("x equals " + x);
				if(i%x!=0){

					break;
				}
				//System.out.println("is it happening?");
				if(i%x==0 & x ==20){
					num=i;
					return num;

				}
			}
		}
		return num; 
	}

	//Find the largest palindrome made from the product of two 3-digit numbers.
	public static int four(){
		int value = 1;
		int prevVal = 0;
		int bigVal=1;
		for (int i = 100;  i<1000;i++){
			for(int x = i; x<1000;x++){
				value = i * x;
				if(drome(value)&& value > prevVal){
					bigVal = value;
					prevVal = value;
				}
			}
		}
		System.out.println(bigVal);
		return bigVal;
	}
	//check if the value from four() is a palindrome
	public static boolean drome(int a){
		String strA = "";
		strA = Integer.toString(a);
		String revStrA = "";
		int len = strA.length();

		int x,y;

		for(int i = len-1; i>-1; i--){
			revStrA = revStrA + strA.charAt(i);

		}
		x = Integer.parseInt(strA);
		y = Integer.parseInt(revStrA);
		if(x == y){ 
			return true;
		}

		return false;
	}

	public static long three(){
		long bigPup = 600851475143L;
		long primeNum = 1;
		long prevNum = 0;
		for(long i = 1; i < bigPup/2; i+=2){
			if(bigPup%i == 0){
				if(prime(i)){
					primeNum = i;
					if(primeNum>prevNum){						
						prevNum = primeNum;
						System.out.println("prime num = " + primeNum);
					}
				}
			}
		}
		return primeNum;
	}
	public static boolean prime(long num){
		for(long i = 1; i<num/2;i++){
			if(num%i==0 && i != 1){
				return false;
			}
		}
		return true;
	}
	/*prime function is included in the solution to question three
	 * originally was solving using i*i < bigPup and i*i < num (in prime())
	 * does not solve for all possible values so switched to bigPup/2 and num/2
	 * both return same answer for the projct euler answer, but /2 takes forever
	 */

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

	public static int one(){
		int sum = 0; 
		for(int i = 0; i <1000; i++){
			if (i % 3 != 0 && i % 5 != 0){
				continue;
			}
			sum += i;	
		}
		return sum;
	}

	public static int one_slow(){
		int sum = 0;
		for (int i =0; i < 1000; i++){
			if (i%3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		return sum;
	}
















}

