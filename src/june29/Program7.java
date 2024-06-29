package june29;

import java.util.Scanner;

/*
 * Print how many even and odd numbers present in an array
 */
public class Program7 {
	static Scanner scanner = new Scanner(System.in);

	public 	static void readArray(int[] nums){
		System.out.println("Enter the  "+nums.length+" elements to store in an array :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scanner.nextInt();
		}
	}

	static void oddOrEven(int[] nums){
		int ec=0;
		int oc=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0)
				ec++;
			else
				oc++;
		}
		System.out.println("even numbers present in th array are "+ ec);
		System.out.println("odd numbers present in the array are : "+oc);
	}
	public static void main(String[] args) {
		System.out.println(" Enter the size of an Array :");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		readArray(nums);
		oddOrEven(nums);
	}
}
