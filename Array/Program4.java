package Array;

public class Program4 {

	public static void main(String[] args) {
int[] arr = {7, 2, 10, 5}; // Sample Input
        
        // Handle empty array case
        if (arr.length == 0) return;

        // Step 1: Assume the first element is the largest
        int max = arr[0];

        // Step 2: Iterate through the rest of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Step 3: Update max if a larger value is found
            }
        }

        System.out.println(max);

	}

}
