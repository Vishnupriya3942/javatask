package Pattern;

public class Program16 {

	public static void main(String[] args) {
		int n = 5; // Sample Input

        for (int i = 1; i <= n; i++) {
            // 1. Ascending part
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 2. Descending part
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
	}

}
