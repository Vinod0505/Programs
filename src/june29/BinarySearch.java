package june29;

import java.util.Scanner;

public class BinarySearch {

	static int binarySearch(int arr[], int left, int right, int target)
	{
		if (right >= left) {

			int mid = left + (right - left) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == target)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > target)
				return binarySearch(arr, left, mid - 1, target);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, right, target);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver code
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int arr[] = { 2, 3, 4, 10, 40,45,7,9,11};
		int n = arr.length;
		int target = 10;
		int result = binarySearch(arr, 0, n - 1, target);
		if (result == -1)
			System.out.println(
					"Element is not present in array");
		else
			System.out.println(
					"Element is present at index " + result);
	}

}
