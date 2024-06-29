package june29;

import java.util.Scanner;

/*
 * read n integers from the user and print how many prime numbers in that
 */
public class Program5 {

	static Scanner scanner = new Scanner(System.in);

	public 	static void readArray(int[] nums){
		System.out.println("Enter the  "+nums.length+" elements to store in an array :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scanner.nextInt();
		}
	}

	static boolean isPrime(int n){
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static void countPrimeNumber(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(isPrime(nums[i]))
				count++;
		}
		System.out.println("No of prime numbers ina an array are : " + count);
	}
	public static void main(String[] args) {
		System.out.println(" Enter the size of an Array :");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		readArray(nums);
		countPrimeNumber(nums);
	}
}
