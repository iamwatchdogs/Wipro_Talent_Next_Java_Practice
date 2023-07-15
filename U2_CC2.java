// Question:
// Write a Java program to implement class mechanism. -Create a class, method with name myMethod() and invoke it inside main method. Method inside the class should display a serise 201, 202, 204, 207 upto 'n' terms.

// Input Format:
// Single line integer

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 6
// Sample Output 0:
// 201 202 204 207 211 216 

import java.util.Scanner;

class MyClass {
    public static void myMethod(int n){
        for(int i = 0, num = 201; i < n; i++, num += i)
            System.out.printf("%d ",num);
    }
}

public class U2_CC2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        MyClass.myMethod(n);
    }
}
