// Question:
// Write a Java program to search for an element in a given list of elements using binary search mechanism.

// Input Format:
// First line contains an integer represents number of elements.
// Second line contains space seprated 'n' integers.
// Third line contains an integer that to be found.

// Constraints:
// None

// Output Format:
// Refer the sample test cases.

// Sample Input 0:
// 5
// 1 9 18 27 36
// 27
// Sample Output 0:
// Element found at position 4
    
// Sample Input 1:
// 5
// 1 9 18 27 36
// 77
// Sample Output 1:
// Element not found!!

import java.util.Scanner;

public class U2_M2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int res = binarySearch(arr, len, target);
        if(res >= 0){
            System.out.printf("Element found at position %d\n",res);
        } else {
            System.out.println("Element not found!!");
        }
    }
    public static int binarySearch (int [] arr, int len, int target){
        int head = 0, end = len-1;
        while(head <= end){
            int mid = (head+end)/2;
            if(arr[mid] == target)      return mid+1;
            else if(arr[mid] > target)  end = mid-1;
            else                        head = mid+1;
        }
        return -1;
    }
}
