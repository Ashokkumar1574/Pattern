import java.util.Scanner;

public class DiamondOutlinePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (half of the diamond height):");
        int rows = sc.nextInt();
        sc.close();

        // Print the upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int k = 1; k < 2 * (i - 1); k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        // Print the lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int k = 1; k < 2 * (i - 1); k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
