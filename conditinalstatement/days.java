package conditinalstatement;
import java.util.Scanner;

public class days {

	public static void main(String[] args) {
//		5. Print Day based on input (1-7)
//		   Map numbers 1-7 to days of the week.
//		   Sample Input: 3
//		   Sample Output: Wednesday
 Scanner sc=new Scanner(System.in);
 
 System.out.println("enter input:(1-7)");
 int d=sc.nextInt();
 
 switch(d)
 {
 case 1:
 	System.out.println("Output: Monday");
 	break;
 case 2:
 	System.out.println("Output: Tuesday");
 	break;
 case 3:
 	System.out.println("Output: Wednesday");
 	break;
 case 4:
 	System.out.println("Output: Thursday");
 	break;
 case 5:
 	System.out.println("Output: Friday");
 	break;
 case 6:
 	System.out.println("Output: Saturday");
 	break;
 case 7:
 	System.out.println("Output: Sunday");
 	break;
 	default:
 		System.out.println("Output: invalid");
 }
 
 sc.close();

	}

}
