package Pattern;

public class Program15 {

	public static void main(String[] args) {
		int n = 5; // Sample Input
        char alphabet = 'A'; // The "counter" starting point

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for characters per row
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++; // Move to the next character in ASCII
            }
            // Line break after each row
            System.out.println();
        }

	}

}
