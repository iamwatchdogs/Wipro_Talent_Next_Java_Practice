// QUESTION:
// Write a Java program to multiply two user given float values.

// Input Format
// Refer sample test cases.

// Constraints
// None

// Output Format
// Refer sample test cases.

// Sample Input 0
// 4.0 5.0

// Sample Output 0
// Multiplication is: 20.0

// Sample Input 1
// 12.47 3.2

// Sample Output 1
// Multiplication is: 39.904003


import java.util.Scanner;

public class U1_E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication is: " + scanner.nextFloat()*scanner.nextFloat());
    }
}
