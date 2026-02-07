package Pattern;
import java.util.Scanner;
public class Prrogram6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Check if we are on the boundary
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    // Print two spaces to maintain alignment (one for star, one for space)
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();

	}

}
