// Question:
// Write a Java program to count number of digits in the given number.

// Input Format:
// Sinlge line integer

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 9519
// Sample Output 0:
// Number of digits in 9519 is 4

import java.util.Scanner;

public class U1_M4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("Number of digits in %d is %d", number, String.valueOf(number).length());
    }
}
