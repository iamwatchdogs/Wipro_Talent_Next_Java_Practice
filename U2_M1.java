// Question:
// Write a Java method to find the power of a number. Base and exponent to be taken from the user.

// Input Format:
// Space separated two integers

// Constraints:
// None

// Output Format:
// Power of a number as output

// Sample Input 0:
// 2 3
// Sample Output 0:
// 8

import java.util.Scanner;

public class U2_M1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int exp = scanner.nextInt();
        System.out.println(power(num,exp));
    }
    public static long power(int num, int exp){
        long res = 1;
        while(exp-->0)  res *= num;
        return res;
    }
}
