package june26programs;

import java.util.Scanner;

/*
 * Write a program to count the number of factors of a number
 */
public class Program3 {
	
	 public static void main(String[] args) {
		 //Read the input from the user
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number :");
		 int num=scanner.nextInt();
		 int count=0;
		 
		 for(int i=1;i<=num/2;i++) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 System.out.println("The number of factors for the "+num+  " is " +count);
	}
}
