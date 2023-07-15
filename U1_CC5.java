// Question:
// Jerry and Tom decided to mow the lawn in and around the badminton court which will cost them Rs.5 per square feet. Amount spent by them and length of the court is given, write a Java program to find the difference between width of the courts.

// Input Format:
// Space separted four integers.
// First two are amount spent by Jerry and Tom
// The next two are lengths of the courts.

// Constraints:
// None

// Output Format:
// A positive difference of width adjusted to two decimal places

// Sample Input 0:
// 100000 80000 100 80
    
// Sample Output 0:
// 0.00

import java.util.Scanner;

public class U1_CC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Given Inputs
        double jerryTotalAmount = scanner.nextDouble();
        double tomTotalAmount  = scanner.nextDouble();
        int jerryCourtLength = scanner.nextInt();
        int tomCourtLength = scanner.nextInt();
        
        double jerryCourtWidth = jerryTotalAmount/(5 * jerryCourtLength);
        double tomCourtWidth = tomTotalAmount/(5 * tomCourtLength);
        
        System.out.printf("%.2f\n",Math.abs(jerryCourtWidth - tomCourtWidth));
    }
}
