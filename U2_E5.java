// Question:
// Write a Java method to check whether given number is a palindrome or not.

// Input Format:
// Single integer

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 789987
// Sample Output 0:
// Palindrome!
    
// Sample Input 1:
// 789
// Sample Output 1:
// Not a palindrome!

import java.util.Scanner;

public class U2_E5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPalindrome(num) ? "Palindrome!" : "Not a palindrome!");
    }
    public static boolean isPalindrome(int num){
        String n = String.valueOf(num);
        int len = n.length();
        for(int i = 0; i < len; i++){
            if(n.charAt(i) != n.charAt(len-1-i))  return false;
        }
        return true;
    }
}
