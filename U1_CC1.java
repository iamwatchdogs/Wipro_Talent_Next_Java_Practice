// Question:
// Write a java program that display the roots of a quadratic equation ax2+bx+c=0. Calculate the discriminate D and basing on value of D, describe the nature of root.

// Input Format:
// Space seprated three double values.

// Constraints:
// None

// Output Format:
// Refer the sample test cases.

// Sample Input 0:
// 21 12 36
// Sample Output 0:
// Roots are imaginary

// Sample Input 1:
// 5 12 5
// Sample Output 1:
// Roots are real and un-equal
// Root1:-0.53667504192892
// Root2:-1.86332495807108

import java.util.Scanner;

public class U1_CC1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        double discriminant = b*b - 4*a*c;
        
        if(discriminant >= 0){
            double root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.printf("Roots are real and %s\n", (discriminant == 0) ? "equal" : "un-equal");
            System.out.println("Root1:" + root1);
            System.out.println("Root2:" + root2);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}
