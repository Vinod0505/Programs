package june29;
/*
 * to calculate the sum of digits in the string 
 */
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String st = sc.next();
		int sum=0;
		for(int i=0;i<st.length();i++) {	
			char ch=st.charAt(i);
			if(ch>='0' && ch<='9') {
				sum+= ch-48;
			}
		}
		System.out.println("The sum of digits present in the string "+ sum);
	}
}
