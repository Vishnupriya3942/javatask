package Array;
import java.util.Arrays;
public class Program6 {

	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 4}; // Sample Input

        // Outer loop: fixed position
        for (int i = 0; i < arr.length; i++) {
            // Inner loop: check all elements after i
            for (int j = i + 1; j < arr.length; j++) {
                // If a smaller element is found, swap them
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

	}

}
