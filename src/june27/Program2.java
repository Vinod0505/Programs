package june27;

import java.util.Scanner;

/*
 * Write a program to calculate the HCF(GCD) of two numbers.
 */
public class Program2 {

	public static int hcf(int num1,int num2) {
		
		int largest = num1>num2?num1:num2;
		int hcf=1;
		for(int i =largest/2;i>=2;i--) {
			if(num1%i==0 && num2%i==0) {
				hcf=i;
				break;
			}
		}
		return hcf;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scanner.nextInt();
		System.out.println("Enter the second number");
		int num2=scanner.nextInt();
		System.out.println(hcf(num1,num2));
	}
}
