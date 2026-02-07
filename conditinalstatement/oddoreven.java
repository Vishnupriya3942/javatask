package conditinalstatement;
import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
//		1. Odd or Even
//		   Check whether the number is odd or even.
//		   Sample Input: 10
//		   Sample Output: Even
 Scanner sc=new Scanner(System.in);
 System.out.println("enter input:");
 int n=sc.nextInt();
 if(n%2==0)
 {
 	System.out.println("output: even");
 }
 else
 {
 	System.out.println("output: odd");
 }
 sc.close();

	}

}
