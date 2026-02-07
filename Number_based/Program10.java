package Number_based;

public class Program10 {

	public static void main(String[] args) {
		
		        int num = 153; // Sample Input
		        int originalNum = num;
		        int sum = 0;

		        while (num > 0) {
		            int digit = num % 10;
		            // Add the cube of the digit to sum
		            sum += (digit * digit * digit); 
		            num = num / 10;
		        }

		        if (sum == originalNum) {
		            System.out.println("Armstrong");
		        } else {
		            System.out.println("Not Armstrong");
		        }

	}

}
