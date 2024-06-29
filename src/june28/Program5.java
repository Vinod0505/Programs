package june28;

import java.util.Scanner;

/*
 * Check the given month number is valid or not

 */
public class Program5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number");
		int num = scanner.nextInt();
		if(num>0 && num<13) {
			System.out.println("it is a valid month number");
		}else {
			System.out.println("it is not a valid month number");
		}
	}
}
