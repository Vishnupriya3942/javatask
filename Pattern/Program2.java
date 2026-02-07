package Pattern;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {//1(2)
            // Inner loop runs 'i' times for the current row
             for (int j = 1; j <= i; j++) {//2(3)
                  System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
        
//        sc.close();

	}

}
