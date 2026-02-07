package conditinalstatement;
import java.util.Scanner;
public class maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Find maximum of 2, 3, 4 numbers
//		   Use if-else ladder or nested if to find the maximum.
//		   Sample Input: 7 15 3 9
//		   Sample Output: Maximum: 15

Scanner sc=new Scanner(System.in);
System.out.println("enter the first value:");
int a=sc.nextInt();
System.out.println("enter the second value");
int b=sc.nextInt();
System.out.println("enter the third value");
int c=sc.nextInt();
System.out.println("enter the fourth value");
int d=sc.nextInt();
System.out.println("Output:");
if(a>b)
{
	if(a>c && a>d)
	{
		System.out.println("maximum:"+a);
	}
}
else if(b>c && b>d)
{
	System.out.println("maximum:"+b);
}
else if(c>d)
{
	System.out.println("maximum:"+c);
}
else
{
	System.out.println("maximum: "+d);
}
	

	}

}
