public class ZigZagNamePattern {
    public static void main(String[] args) {
        String name = "YOUR_NAME"; // Change this to your name
        int n = name.length();

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                // Print the character if it is in the main diagonal or in the diagonal opposite to the main diagonal
                if (i == j || i + j == n - 1) {
                    System.out.print(name.charAt(j));
                } else {
                    // Print a space for other positions
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
