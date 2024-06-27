package descisionmakingstatements;

import java.util.Scanner;

/*
 * Suppose you have a temperature sensor in a room,
 * and you want to determine if the current temperature
 * reading falls within an acceptable range for the room's comfort.
 * 
 * You have predefined lower and upper bounds for the acceptable
 * temperature range (e.g. lower bound = 70F and upper bound = 80F).
 * 
 * WAP  to read the current temperature value in Celsius(in this case, 25C )
 * and convert it into Fahrenheit, print the temperature in Fahrenheit,
 * then check if it falls within the specified range . if it does, the program prints
 * "Temperature is within the range".
 */
public class Program3 {

	public static void main(String[] args) {
		
		int min_temp =70;
		int max_temp=80;
		Scanner sc = new Scanner(System.in);
		//1.read current temperature in celsius
		int current_temp = sc.nextInt();
		
		//convert it into fahrenheit
		double converted_temp = current_temp * ((double)9/5) + 32;
		
		//check if temperature is in specified range 
		
		if(converted_temp>=min_temp && converted_temp<=max_temp) {
			System.out.println("temperature within the range");
		}else {
			System.out.println(converted_temp);
		}
	}
}
