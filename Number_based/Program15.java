package Number_based;

public class Program15 {

	public static void main(String[] args) {
		int num = 5; // Sample Input
        StringBuilder binary = new StringBuilder();

        if (num == 0) {
            System.out.println(0);
            return;
        }

        while (num > 0) {
            int remainder = num % 2;
            binary.append(remainder); // Add remainder to the end
            num = num / 2;            // Divide number by 2
        }

        // Reverse the string because remainders are found in reverse order
        System.out.println(binary.reverse().toString());

	}

}
