package conditinalstatement;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
//		6. Check if 3 sides form a Triangle
//		   Check triangle condition: a + b > c, etc.
//		   Sample Input: 3 4 5
//		   Sample Output: Triangle is possible

Scanner sc=new Scanner(System.in);

System.out.println("enter inputs: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a+b>c)
{
	 System.out.println("output : Triangle is possible");
}
else
{
	 System.out.println("output:Triangle is not possible");
}


sc.close();

	}

}
