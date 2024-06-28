package june27;

import java.util.Scanner;

/*
 * Write a program to find the given number is prime number or not.
 */
public class Program1 {

	static boolean isPrime(int num){
		if(num<1) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		if(isPrime(scanner.nextInt())) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}
	}
}
