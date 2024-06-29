package june29;

import java.util.Scanner;

public class LinearSearch {

	static int searchElement(int[]nums,int target){
		
		for(int i=0;i<nums.length;i++) {
			if(target==nums[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int target=scanner.nextInt();
		int nums[]= {6,4,7,3,8,1};
		int element = searchElement(nums,target);
		System.out.println("The element is present at index "+element);
	}
}
