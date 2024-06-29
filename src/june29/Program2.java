package june29;

import java.util.Scanner;

/*
 * write a logic to read and store elements in an array and print in reverse order.
 */
public class Program2 {
	static Scanner scanner = new Scanner(System.in);
	
	public 	static void readArray(int[] nums){
		System.out.println("Enter the  "+nums.length+" elements to store in an array :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scanner.nextInt();
		}
	}

	static void reverseAnArray(int[] n) {
		for(int i=n.length-1;i>=0;i--) {
			System.out.println(n[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println(" Enter the size of an Array :");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		readArray(nums);
		System.out.println("reversing the array ");
		reverseAnArray(nums);
	}
}
