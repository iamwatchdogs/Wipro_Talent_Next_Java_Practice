// Question:
// Write a Java program to swap two numbers without using a third variable.

// Input Format
// Refer sample test case.

// Constraints
// None

// Output Format
// Refer sample test case

// Sample Input 0
// 57 99
// Sample Output 0
// 57
// 99
// 99
// 57

import java.util.Scanner;

public class U1_E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + "\n" + b);
        a = (a+b) - (b=a);
        System.out.println(a + "\n" + b);
    }
}
