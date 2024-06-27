package descisionmakingstatements;

import java.util.Scanner;

/*
 *  WAP to read four integer numbers and display the largest
 */
public class Program2a {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
//		if(a>b && a>c && a>d) {
//			System.out.println("Largest is "+ a);
//		}else if(b>c && b>d) {
//			System.out.println("Largest is "+b);
//		}else if(c>d) {
//			System.out.println("Largest is "+c);
//		}else {
//			System.out.println("largest is "+ d);
//		}
		
		int largest = a>b&&a>c&&a>d?a:b>c&&b>d?b:c>d?c:d;
		System.out.println(" largest is "+ largest	);
	}
}
