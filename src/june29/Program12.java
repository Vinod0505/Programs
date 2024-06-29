package june29;

import java.util.Scanner;

/*
 * to define a method to return how many special characters present in a string
 */
public class Program12 {

	static int countSpecialcharacters(String str){
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if((ch>='A'&& ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')==false)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scanner.next();
		int i = countSpecialcharacters(str);
		System.out.println(i);
	}
}
