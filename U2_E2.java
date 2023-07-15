// Question:
// Write a Java method to find largest among three given numbers.

// Input Format:
// Space separated three numbers

// Constraints:
// None

// Output Format:
// Refer sample test cases

// Sample Input 0:
// 77 45 57
// Sample Output 0:
// Largest number is:77

import java.util.Scanner;

public class U2_E2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Largest number is:" + largestNumber(a, b, c));
    }
    public static int largestNumber ( int ...num ){
        int maxNum = Integer.MIN_VALUE;
        for(int i : num){
            maxNum = Math.max(maxNum, i);
        }
        return maxNum;
    }
}
