package june29;

import java.util.Scanner;

/*
 * read m integer values from the user and print the sum of those array elements
 */
public class Program3 {
	
static Scanner scanner = new Scanner(System.in);
	
	public 	static void readArray(int[] nums){
		System.out.println("Enter the  "+nums.length+" elements to store in an array :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scanner.nextInt();
		}
	}
	
	static int sumOfArray(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+= nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(" Enter the size of an Array :");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		readArray(nums);
		System.out.println("The sum of elements presenet in above array is ");
		System.out.println(sumOfArray(nums));
		
	}
}
