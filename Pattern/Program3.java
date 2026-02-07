package Pattern;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Outer loop: Start from n and go down to 1
        for (int i = n; i >= 1; i--) {
            // Inner loop: Print 'i' stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
        
        sc.close();

	}

}
