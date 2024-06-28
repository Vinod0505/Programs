package june28;

import java.util.Scanner;

/*
 * Check given number is a special two digit number or not.
 */
public class Program1 {

	static boolean	isSpecialTwoDigitNumber(int num){
		int digit1=num/10;//quotient
		int digit2 = num%10;//remainder
		return (digit1+digit2) + (digit1*digit2) == num;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		if(isSpecialTwoDigitNumber(scanner.nextInt())) {
			System.out.println(" It is a special two digit number");
		}else {
			System.out.println("It is not a special two digit number");
		}
	}
}
