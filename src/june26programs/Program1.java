package june26programs;

import java.util.Scanner;

/*
 * Write a program to find the factors for given natural number
 * 
 * Ex:-  1) input - 6
 * 		 	 output - 1,2,3,6
 */
public class Program1 {

	public static void main(String[] args) {
		//1.read the input
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//2. logic to find the factors
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i+", ");
			}
		}
	}
}
