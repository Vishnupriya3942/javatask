package Number_based;

public class Program6 {

	public static void main(String[] args) {
		int num = 789; // Sample Input
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;          // Get the last digit
            reversed = reversed * 10 + digit; // Shift existing digits left and add new one
            num = num / 10;                // Remove the last digit
        }

        System.out.println(reversed);

	}

}
