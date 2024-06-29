package june29;

import java.util.Scanner;

/*
 * Program to count how many vowels and consonants present in the string 
 */
public class Program10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scanner.nextLine();
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		int countVowels=0;
		int countConsonants=0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
					countVowels++;
					else 
					countConsonants++;
			}
		}
		System.out.println("The no of vowels present in the string "+countVowels);
		System.out.println("The no of consonants present in the string "+countConsonants);
	}
}
