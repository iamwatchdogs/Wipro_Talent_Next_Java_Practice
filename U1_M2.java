// Question:
// Write a Java program to find ASCII value of a given character.

// Input Format:
// Single line character.

// Constraints:
// None

// Output Format:
// Refer sample test cases.

// Sample Input 0:
// J
// Sample Output 0:
// ASCII of J is 74

import java.util.Scanner;

public class U1_M2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.printf("ASCII of %c is %d",letter,(int)letter);
    }
}
