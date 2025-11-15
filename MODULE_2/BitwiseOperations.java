import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Bitwise operations
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;

        // Display results in decimal and binary
        System.out.println("\n--- Bitwise Operation Results ---");

        System.out.println("AND (&): " + andResult + "  (Binary: " + Integer.toBinaryString(andResult) + ")");
        System.out.println("OR  (|): " + orResult + "  (Binary: " + Integer.toBinaryString(orResult) + ")");
        System.out.println("XOR (^): " + xorResult + "  (Binary: " + Integer.toBinaryString(xorResult) + ")");

        sc.close();
    }
}
