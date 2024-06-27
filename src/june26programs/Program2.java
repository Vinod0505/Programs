package june26programs;

import java.util.Scanner;

/*
 * Write a program to find the factorial of a number
 * ex- input -3 
 * 	output 3 x 2 x 1 =6
 */  
public class Program2 {

	public static void main(String[] args) {
		
		//1.read the input from the user
		System.out.println("Enter the Number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result =1;
		//2.write the logic
//		while(num!=0) {
//			result = result*num;
//			num--;
//		}
		
		do {
			result = result*num;
			num--;
		}while(num!=1);
		System.out.println(result);
	}
}
