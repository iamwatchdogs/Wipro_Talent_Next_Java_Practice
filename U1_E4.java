// Question:
// Write a Java program to compute Quotient and Remainder of two given numbers.

// Input Format
// Refer sample test case

// Constraints
// None

// Output Format
// Refer sample test case

// Sample Input 0
// 9 3
// Sample Output 0
// Quotient:3
// Remainder:0

// Sample Input 1
// 17 9
// Sample Output 1
// Quotient:1
// Remainder:8

import java.util.Scanner;

public class U1_E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Quotient:" + x/y + "\nRemainder:" + x%y);
    }
}
