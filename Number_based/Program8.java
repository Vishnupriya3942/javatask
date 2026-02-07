package Number_based;

public class Program8 {

	public static void main(String[] args) {
		int num = 2375; // Sample Input
        String result = "";
        boolean foundPrime = false;

        // Use a temporary variable to keep the original num intact if needed
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            
            // Prime digits are 2, 3, 5, 7
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                // Prepend to string to keep original order
                result = digit + " " + result;
                foundPrime = true;
            }
            temp /= 10;
        }

        if (foundPrime) {
            System.out.println("Prime Digits: " + result.trim());
        } else {
            System.out.println("Prime Digits: None");
        }

	}

}
