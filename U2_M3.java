// Question:
// Write a Java program to perform multiplication of two r1*c1, r2*c2 matrices.
// r1, c1-first matrix no. of rows and columns
// r2, c2-second matrix no. of rows and columns
// (r1, r2, c1 and c2 to be taken from the user).

// Input Format:
// First line contains space separated r1, c1, r2 and c2 values
// Second line contains space separted r1*c1 no. of elements
// Third line contains space separted r1*c1 no. of elements

// Constraints:
// Check the matrix compatibility before perform multiplication

// Output Format:
// Refer the sample test case.

// Sample Input 0:
// 2 3 3 2
// 1 0 1 0 1 2
// 3 5 -1 0 2 -1
// Sample Output 0:
// 5 4 
// 3 -2
    
// Sample Input 1:
// 2 3 4 3
// 1 2 3 4 5 6
// 9 8 7 6 5 4 3 2 1 9 8 9
// Sample Output 1:
// Column of first matrix not equal to row of second. Matrix are incompatible.

import java.util.Scanner;

public class U2_M3{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        
        if(c1 != r2){
            System.out.println("Column of first matrix not equal to row of second. Matrix are incompatible.");
        } else {
            int [][] m1 = new int[r1][c1];
            int [][] m2 = new int[r2][c2];
            int [][] m = new int[r1][c2];
            
            for(int i = 0; i < r1; i++)
                for(int j = 0; j < c1; j++)
                    m1[i][j] = scanner.nextInt();
            
            for(int i = 0; i < r2; i++)
                for(int j = 0; j < c2; j++)
                    m2[i][j] = scanner.nextInt();
            
            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c2; j++) {
                    for(int k = 0; k < c1; k++){
                        m[i][j] += m1[i][k]*m2[k][j];
                    }
                }
            }
            
            for(int i = 0; i < r1; i++){
                for(int j = 0; j < c2; j++){
                    System.out.print(m[i][j] + " ");
                }
                System.out.println();
            }
        }
        
    }
}
