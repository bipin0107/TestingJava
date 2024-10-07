package Java;

import java.util.HashMap;
import java.util.Map;

public class MiddleIndex {
	public static int findFirstUniqueIndex(int[] arr) {
		
		int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // Iterate through the array to find the equilibrium index
        for (int i = 0; i < arr.length; i++) {
            // totalSum - leftSum - arr[i] gives the right sum
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;
            }
            leftSum += arr[i];
        }

        // Return -1 if no equilibrium index is found
        return -1;
	}
	
	public static void main(String[] args) {
		    int[] arr1 = {1, 1, 1, 2, 2, 1};
	        int[] arr2 = {5, 3, 2, 1, 2};
	        int[] arr3 = {5, 3, 2, 1, 10, 11};

	        System.out.println("Index of first unique element in arr1: " + findFirstUniqueIndex(arr1)); // Output: 3
	        System.out.println("Index of first unique element in arr2: " + findFirstUniqueIndex(arr2)); // Output: 0
	        System.out.println("Index of first unique element in arr3: " + findFirstUniqueIndex(arr3)); // Output: 4
		
	}
}
