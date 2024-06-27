package descisionmakingstatements;
/*
 * Design an app to read age of three siblings ramu,raghu,raju and store them in a variable
 * .The app when executed should display the age of youngest siblings. 
 */


import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		//1.three variables
		int raghu, ramu,raju;

		//2.read inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of raghu");
		raghu=sc.nextInt();
		System.out.println("enter the age of ramu");
		ramu = sc.nextInt();
		System.out.println("enter the age of raju");
		raju = sc.nextInt();

		//3.Logic to compare
		int youngestAge = raghu<ramu && raghu<raju ? raghu : ramu<raju?ramu:raju;

		if(youngestAge>0) {
			System.out.println(youngestAge+" is the youngest Age");
		}else {
			System.out.println("Invalid age");
		}
	}

}
