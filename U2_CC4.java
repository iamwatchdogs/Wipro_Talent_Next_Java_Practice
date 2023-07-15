// Question:
// Write a Java program to implement method overloading. Name the method as 'calculate()'.
// First method should take two arguments and perform multiplication.
// Second method should take three arguments and perform addition.

// Input Format:
// Five integer values

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 10 20 30 40 50
// Sample Output 0:
// Multiplicaton of 10 and 20 is : 200
// Addition of 30, 40 and 50 is : 120

import java.util.Scanner;

public class U2_CC4{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.printf("Multiplicaton of %d and %d is : %d\n", arr[0], arr[1], calculate(arr[0], arr[1]));
        System.out.printf("Addition of %d, %d and %d is : %d\n", arr[2], arr[3], arr[4], calculate(arr[2], arr[3], arr[4]));
    }
    public static int calculate(int a, int b){
        return a*b;
    }
    public static int calculate(int x, int y, int z){
        return x+y+z;
    }
}
