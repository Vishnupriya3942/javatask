package Pattern;

public class progarm14 {

	public static void main(String[] args) {
		int n = 5; // Sample Input

        for (int i = 0; i < n; i++) {
            // Inner loop starts with character 'A'
            for (int j = 0; j <= i; j++) {
                // Casting the sum of 'A' and j back to a char
                System.out.print((char)('A' + j) + " ");
            }
            // Move to the next line
            System.out.println();
        }

	}

}
