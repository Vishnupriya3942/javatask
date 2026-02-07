package conditinalstatement;
import java.util.Scanner;
public class validtime {

	public static void main(String[] args) {
//		8. Validate Time
//		   Check if time is valid in HH\:MM format.
//		   Sample Input: 13:45
//		   Sample Output: Valid Time

Scanner sc=new Scanner(System.in);
int h,m;
System.out.println("enter inputs:");
h=sc.nextInt();
m=sc.nextInt();
if(h<=24 && m<=60)
{
	System.out.println("output:");
	System.out.println("time :"+h+":"+m);
	System.out.println("valid time");
}
else
{
	System.out.println("output:");
	System.out.println("time :"+h+":"+m);
	System.out.println("Invalid time");
	
}

	}

}
