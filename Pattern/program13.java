package Pattern;

public class program13 {

	public static void main(String[] args) {
		int n = 5; // Sample Input

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // If sum of row and column is even, print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

	}

}
