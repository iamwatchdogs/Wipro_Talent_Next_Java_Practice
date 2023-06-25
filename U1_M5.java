// Question:
// Write a Java program to reverse a given number.

// Input Format:
// Sinlge line integer

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 1234
// Sample Output 0:
// Reverse of 1234 is 4321
    
import java.util.Scanner;

public class U1_M5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(num));
        stringBuilder.reverse();
        System.out.printf("Reverse of %d is %d", num, Integer.valueOf(stringBuilder.toString()));
    }
}
