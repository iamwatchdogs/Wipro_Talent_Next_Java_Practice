// Question:
// Suren told that X% of the total money he had is Rs.Y. Write a Java program to find the total money present in his pocket.

// Input Format:
// Two integer values

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 40 120
// Sample Output 0:
// Rs.300

import java.util.Scanner;

public class U1_CC4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("Rs." + (int)((y/x)*100));
    }
}
