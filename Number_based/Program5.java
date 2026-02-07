package Number_based;

public class Program5 {

	public static int getFactorial(int d) {
		int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 145; // Sample Input
        int originalNum = num;
        int totalSum = 0;

        while (num > 0) {
            int digit = num % 10;
            totalSum += getFactorial(digit); // Calculate and add factorial
            num = num / 10;
        }

        System.out.println("Sum of factorials: " + totalSum);

	}

}
