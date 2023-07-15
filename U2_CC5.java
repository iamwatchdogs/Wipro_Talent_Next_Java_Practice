// Question:
// Write a Java program to sort for an element in a given list of elements using bubble sort.

// Input Format:
// First line contains number of elements in the list
// Second line contains space seprated numbers

// Constraints:
// None

// Output Format:
// Refer the sample test case

// Sample Input 0:
// 5
// 15 89 60 4 47
// Sample Output 0:
// Un-sorted list:
// 15 89 60 4 47 
// Sorted list:
// 4 15 47 60 89

import java.util.Scanner;

public class U2_CC5{
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int len = scanner.nextInt();
        int [] arr = new int[len];
        System.out.println("Un-sorted list:");
        for(int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
            System.out.printf("%d ",arr[i]);
        }

        for(int i = 0; i < len; i++){
            boolean swapAtleastOnce = false;
            for(int j = 0; j < len-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapAtleastOnce = true;
                }
            }
            if(!swapAtleastOnce)   break;
        }
        
        System.out.println("\nSorted list:");
        for(int i = 0; i < len; i++){
            System.out.printf("%d ",arr[i]);
        }
        
    }
}
