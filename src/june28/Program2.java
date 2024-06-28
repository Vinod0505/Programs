package june28;

import java.util.Scanner;

/*
 * Write a program to calculate the LCM of two given natural numbers
 */
public class Program2 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the first number ");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number ");
		int num2 = scanner.nextInt();
		
		int result=lcm(num1,num2);
		System.out.println(result);
	}

	private static int lcm(int num1, int num2) {
		
		int largest = num1>num2?num1:num2;
			
			return 0;
	}
}
