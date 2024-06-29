package june29;

import java.util.Scanner;

/*
 * how many capital letters and small letters and digits 
 * and special characters present in the user entered string
 */
public class Program8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String st = scanner.next();
		int c=0,s=0,d=0,sp=0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			
			if(ch>='A' && ch<='Z')
				c++;
			else if(ch>='a' && ch<='z')
				s++;
			else if(ch>='0' && ch<='9')
				d++;
			else
				sp++;
		}
		System.out.println("No of Capital letters " + c);
		System.out.println("No of small letters " + s);
		System.out.println("No of digits letters " + d);
		System.out.println("No of special letters " + sp);
		
	}
}
