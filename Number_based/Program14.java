package Number_based;

public class Program14 {

	public static void main(String[] args) {
		long num = 9876543210L; // Use 'L' for long to avoid overflow
        String s = String.valueOf(num);

        // Substring indices are (inclusive, exclusive)
        String part1 = s.substring(0, 3);
        String part2 = s.substring(3, 6);
        String part3 = s.substring(6, 10);

        String formatted = part1 + "-" + part2 + "-" + part3;

        System.out.println(formatted);

	}

}
