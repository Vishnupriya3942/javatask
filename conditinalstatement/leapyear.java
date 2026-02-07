package conditinalstatement;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
//		4. Check Leap Year or Not
//		   Check if a given year is a leap year.
//		   Sample Input: 2024
//		   Sample Output: Leap Year
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input:");
		int a=sc.nextInt();
		
		
		if(a%4==0 || a%400==0)
//				System.out.println("output:leap year");if(a%400==0)
		{
			System.out.println("output:leap year");
		}
		else
		{
			System.out.println("Output:not a leap year");
		}
		
		sc.close();
		

	}

}
