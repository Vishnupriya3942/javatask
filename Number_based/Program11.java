package Number_based;

public class Program11 {

	public static void main(String[] args) {
int num = 1234; // Sample Input
        
        // Convert integer to String
        String numStr = String.valueOf(num);

        // Loop through the string from left to right
        for (int i = 0; i < numStr.length(); i++) {
            // Print the character at index i followed by a space
            System.out.print(numStr.charAt(i) + " ");
        }

	}

}
