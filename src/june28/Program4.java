package june28;

import java.util.Scanner;

/*
 * swap Two Numbers
 */
public class Program4 {

	static void swapTwoNumbers(int num1,int num2){
		System.out.println("before swapping "+num1 + "  " + num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("before swapping "+num1 + "  " + num2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number and second number ");

		swapTwoNumbers(scanner.nextInt(),scanner.nextInt());
	}
}
