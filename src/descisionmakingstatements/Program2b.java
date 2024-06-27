package descisionmakingstatements;

import java.util.Scanner;

/*
 * 
 */
public class Program2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();

		//		if(hours<0 || hours>25) {
		//			System.out.println("Invalid time");
		//		}else if(hours>=5 && hours<=11) {
		//			System.out.println("Good Morning");
		//		}else if(hours>=12 && hours<=16) {
		//			System.out.println("Good afternoon");
		//		}else if(hours>=17 && hours<=20) {
		//			System.out.println("Good Evening");
		//		}else {
		//			System.out.println("Good Night");
		//		}
		String greetings = hours<0 || hours>25?"Invalid time" : 
			hours>=5 && hours<=11 ? "Good Morning" : 
				hours>=12 && hours<=16? "Good Afternoon " :
					hours>=17 && hours<=20 ? " Good Evening" : "Good Ninght";
					System.out.println(greetings);
	}

}
