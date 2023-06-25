// Question:
// Write a Java program to check whether an alphabet is vowel or consonant.

// Input Format
// Single line contains a character.

// Constraints
// None

// Output Format
// Refer the sample test case.

// Sample Input 0
// i
// Sample Output 0
// Vowel

// Sample Input 1
// P
// Sample Output 1
// Consonant

import java.util.Scanner;

public class U1_M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = Character.toLowerCase(scanner.nextLine().charAt(0));
        String vowels = "aeiou";
        System.out.println( (vowels.contains(String.valueOf(letter))) ? "Vowel" : "Consonant");
    }
}
