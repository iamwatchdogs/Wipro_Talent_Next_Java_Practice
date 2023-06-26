// Question:
// The first two terms in an arithmetic progression and positive value 'N' is given as input. Write a Java program to find the Nth term in the progression.

// Input Format:
// Space separated three integers.
// First two are the terms in the AP and third is the N.

// Constraints:
// None

// Output Format:
// Nth term as output

// Sample Input 0:
// 5 10 6
// Sample Output 0:
// 30
    
import java.util.Scanner;

public class U1_CC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(a+(n-1)*(b-a));
    }
}
