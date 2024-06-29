package june29;

import java.util.Scanner;

/*
 * to define a method to return true if the string is palindrome otherwise return false. 
 */
public class Program11 {

	static boolean isPalindrome(String str){
		String reverse="";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			reverse= c+reverse;
		}
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(str))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str= sc.nextLine();
		System.out.println(isPalindrome(str));
	}
}
