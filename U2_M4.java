// Question:
// Write a Java method to display sum of numbers in the Fibonacci sequence up to n terms.

// Input Format:
// Single line integer

// Constraints:
// None

// Output Format:
// Single line integer as in the test case

// Sample Input 0:
// 5
// Sample Output 0:
// Sum of numbers in the Fibonacci sequence up to n terms : 7

// Sample Input 1:
// 1
// Sample Output 1:
// Sum of numbers in the Fibonacci sequence up to n terms : 0

import java.util.Scanner;

public class U2_M4{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        displaySumOfFibonacci(n);
    }
    public static void displaySumOfFibonacci(int n){
        int sum = (n > 1) ? 1 : 0;
        for(int counter = 2, i = 0, j = 1, k = 1; counter < n; ++counter){
            k = j+i;
            i = j;
            j = k;
            sum += k;
        }
        System.out.printf("Sum of numbers in the Fibonacci sequence up to n terms : %d\n",sum);
    }
}
