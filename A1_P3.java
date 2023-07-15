// Questions:
// Generate the pattern as shown in the sample input and output based on the value of n entered by user.

// Input Format:
// Value of n entered by user.

// Constraints:
// You can consider user always enters n value more than 1.

// Output Format:
// Refer sample output.

// Sample Input 0:
// 5
// Sample Output 0:
//     a
//    ba
//   cba
//  dcba
// edcba

// Sample Input 1:
// 8
// Sample Output 1:
//        a
//       ba
//      cba
//     dcba
//    edcba
//   fedcba
//  gfedcba
// hgfedcba

import java.util.Scanner;

public class A1_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i < n; ++i){
            for(int j=i+1; j < n; j++){
                System.out.print(" ");
            }
            for(int j=i; j >= 0; j--){
                System.out.print((char)('a'+j));
            }
            System.out.println();
        }
    }
}
