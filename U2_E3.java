// Question:
// Write a Java method to check whether given number is even or odd.

// Input Format:
// Single integer

// Constraints:
// None

// Output Format:
// Refer sample test cases

// Sample Input 0:
// 99
// Sample Output 0:
// 99 is odd number

// Sample Input 1:
// 990
// Sample Output 1:
// 990 is even number

import java.util.Scanner;

public class U2_E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.printf("%d is %s number\n",num,(num%2 == 0) ? "even" : "odd");
    }
}
