// Question:
// Write a Java program to print an integer which is given by the user.

// Note:
// Use the below syntax to read integers from the user,

// Scanner s=new Scanner(System.in);
// int num=s.next();

// Use s.next() --> To read-string
// Use s.nextFloat() --> To read float value

// Input Format
//Single-line integer

// Constraints
// None

// Output Format
// Refer to sample test case.

// Sample Input 0
// 47

// Sample Output 0
// Given number is: 47


import java.util.Scanner;

public class U1_E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Given number is: " + num);
    }
}
