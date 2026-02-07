package Pattern;

public class Program11 {

	public static void main(String[] args) {
		int n = 5; // Sample Input
        int counter = 1;

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }

	}


