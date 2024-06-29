package june29;

import java.util.Scanner;

/*
 * read n integer values from the use and print biggest one 
 */
public class Program6 {
	static Scanner scanner = new Scanner(System.in);

	public 	static void readArray(int[] nums){
		System.out.println("Enter the  "+nums.length+" elements to store in an array :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scanner.nextInt();
		}
	}
	static int biggestNumber(int[] num){
		int big=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>big)
				big=num[i];
		}
		return big;
	}

	public static void main(String[] args) {
		System.out.println(" Enter the size of an Array :");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		readArray(nums);
		int big=biggestNumber(nums);
		System.out.println(big);
	}
}
