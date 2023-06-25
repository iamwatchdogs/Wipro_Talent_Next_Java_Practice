// Question:
// Write a Java program to check whether given character is alphabet or not.

// Input Format:
// Single character

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// j
// Sample Output 0:
// Alphabet

// Sample Input 1:
// [
// Sample Output 1:
// Not an alphabet

import java.util.Scanner;

public class U1_M3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0);
        System.out.println( Character.isAlphabetic(character) ? "Alphabet" : "Not an alphabet" );
    }
}
