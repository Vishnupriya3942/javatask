package Pattern;
import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // 1. Print leading spaces (n - i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Print stars (i)
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // 3. Move to next line
            System.out.println();
        }
        sc.close();

	}

}
