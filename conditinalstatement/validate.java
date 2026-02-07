package conditinalstatement;
import java.util.Scanner;
public class validate {

	public static void main(String[] args) {
//		7. Validate Date
//		   Check if the entered date is valid (dd/mm/yyyy).
//		   Sample Input: 29/02/2020
//		   Sample Output: Valid Date
Scanner sc=new Scanner(System.in);
int d,m,y;
System.out.print("enter inputs:");
d=sc.nextInt();
m=sc.nextInt();
y=sc.nextInt();
if((d<=31 && m<=12 && y>0))
{
	  if(m>=1 && m<=12)
	  {
		  if(d>=1 && d<=31)
		  {
			  System.out.println("Output:"+d+"/"+m+"/"+y);
			  System.out.println("valid date");
		  }
	  }
}
else
{
	  System.out.println("Output:"+d+"/"+m+"/"+y);
	  System.out.println("output:Invalid date");
}


	}

}
