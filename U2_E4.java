// Question:
// Write a Java method to find sum of factors of a given number.

// Input Format:
// Single integer

// Constraints:
// None

// Output Format:
// Sum of factors as output

// Sample Input 0:
// 8
// Sample Output 0:
// 15

import java.util.Scanner;

public class U2_E4{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(findSumOfFactors(num));
    }
    public static int findSumOfFactors(int num){
        int sum = 0;
        int sqrt = (int)Math.sqrt(num);
        for(int i = 1; i <= sqrt; i++){
            if(num%i == 0){
                sum += i;
                if(i != num/i) sum += num/i;
            }
        }
        return sum;
    }
}
