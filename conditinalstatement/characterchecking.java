package conditinalstatement;

import java.util.Scanner;
public class characterchecking {

	public static void main(String[] args) {
//		3. Alphabet, Number, or Special Character
//		   Identify the type of the charact.
//		   Sample Input: @
//		   Sample Output: Special Character
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input:");
		char al=sc.next().charAt(0);
		if(al>='a' && al<='z' || al>='A' && al<='Z')
		{
			System.out.println("output: alphabet");
		}
		else if(al>='0' && al<='9')
		{
			System.out.println("output: number");
		}
		else
		{
			System.out.println("output:special character");
		}
sc.close();

		
	}

}
