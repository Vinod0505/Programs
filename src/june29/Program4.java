package june29;

import java.util.Scanner;

/*
 * read n persons weight from the user and calculate the avg weight
 */
public class Program4 {

static Scanner scanner = new Scanner(System.in);
	
	public 	static void readArray(int[] nums){
		System.out.println("Enter the  "+nums.length+" elements to store in an array :");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scanner.nextInt();
		}
	}
	
	static void avgOfArray(int[] nums){
		int size = nums.length;
		double sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		double avg= (sum/size);
		System.out.println("The avg is : "+avg);
	}
	public static void main(String[] args) {
		System.out.println(" Enter the size of an Array :");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		readArray(nums);
		avgOfArray(nums);
	}
}
