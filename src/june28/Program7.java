package june28;

import java.util.Scanner;

/*
 * Read the month number from the user and print how many days in that number
 */
public class Program7 {

	static int numberOfDays(int month){
		if(month==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12) {
			return 31;
		}else if( month == 4 || month ==6 || month ==9|| month ==11)
			return 30;
		return 28 ;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number");
		int month = scanner.nextInt();
		int days=numberOfDays(month);
		System.out.println("The number of days present in the month  "+month+" are "+days);
	}
}
