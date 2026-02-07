package Number_based;

public class Program12 {

	public static void main(String[] args) {
		int num = 326741; // Sample Input
        String evenDigits = "";
        String oddDigits = "";
        
        String numStr = String.valueOf(Math.abs(num));

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            int digit = Character.getNumericValue(ch);

            if (digit % 2 == 0) {
                evenDigits += digit + " ";
            } else {
                oddDigits += digit + " ";
            }
        }

        // Print results with "None" check
        System.out.print("Even: ");
        System.out.println(evenDigits.isEmpty() ? "None" : evenDigits.trim());
        
        System.out.print("Odd: ");
        System.out.println(oddDigits.isEmpty() ? "None" : oddDigits.trim());

	}

}
