package Array;
import java.util.HashSet;
import java.util.Set;
public class Program5 {

	public static void main(String[] args) {
int[] arr = {1, 2, 2, 3, 3, 4}; // Sample Input
        
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            // .add() returns false if the element is already present
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Print the duplicates
        for (int d : duplicates) {
            System.out.print(d + " ");
        }
	}

}
