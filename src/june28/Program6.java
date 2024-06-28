package june28;

import java.util.Scanner;

/*
 * check Given number is a digit or Number 
 */
public class Program6 {

	static String digitOrNumber(int n){
		int count=0;
		while(n!=0) {
			int digit=n%10;
			count++;
			n/=10;
		}
		if(count==1)
			return "It is a digit";
		return "It is a number";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		System.out.println(digitOrNumber(n));
	}
}
