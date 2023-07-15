// Question:
// Write a Java program to sort given list of elements using bubble sort

// Input Format:
// First line contains number of elements in the list
// Second line contains space seprated numbers

// Constraints:
// None

// Output Format:
// Refer the sample test case

// Sample Input 0:
// 4
// 1 8 9 4
// Sample Output 0:
// 1 4 8 9

import java.util.Scanner;

public class U2_M5{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < len; i++){
            boolean anySwapOccurance = false;
            for(int j = 0; j < len-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    anySwapOccurance = true;
                }
            }
            if(!anySwapOccurance)   break;
        }
        for(int i = 0; i < len; i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
