package Number_based;

public class Program4 {

	public static void main(String[] args) {
		int num = 123; // Sample Input
        int product = 1;

        // Handle the case where the number is 0
        if (num == 0) {
            product = 0;
        } else {
            num = Math.abs(num); // Handle negative numbers
            while (num > 0) {
                int digit = num % 10;
                product *= digit; // Multiply current product by the digit
                num = num / 10;
            }
        }

        System.out.println(product);

	}

}
