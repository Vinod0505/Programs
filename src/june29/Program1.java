package june29;

/*
 * to calculate how many days in a month using inbuilt methods. 
 */
import java.time.YearMonth;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number");
		int month = scanner.nextInt();
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		
		int days=YearMonth.of(year, month).lengthOfMonth();
		System.out.println("The number of days present in month "+month+" and year " +year+" is "+days );
	}
}
