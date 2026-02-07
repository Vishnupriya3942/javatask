package Number_based;

public class Program9 {

	public static void main(String[] args) {
		int num = 121; // Sample Input
        int originalNum = num;
        int reversed = 0;

        // Step 1: Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        // Step 2: Compare with original
        if (originalNum == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

	}

}
