package june28;

import java.util.Scanner;

/*
 * Write a program to check the given number is Palindrome or not.
 */
public class Program3 {

	static boolean	checkPalindrome(int num){
		//303
		int temp=num;
		int rev=0;
		while(num!=0) {
			int digit = num%10;
			rev=rev*10+digit;
			num = num/10;
		}
		return temp==rev;
	}

	// 	static void palindrome(String num){
	// 			StringBuilder s = new StringBuilder(num).reverse();
	// 			System.out.println(s);
	// 		}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");

		System.out.println(checkPalindrome(scanner.nextInt()));

	}
}
