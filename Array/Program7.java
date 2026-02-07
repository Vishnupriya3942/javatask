package Array;
import java.util.Arrays;
public class Program7 {

	public static void main(String[] args) {
		int[] original = {1, 2, 3};
        // Create a new array of the same size
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied Array: " + Arrays.toString(copy));

	}

}
