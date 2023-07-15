// Question:
// In an organization, the management wants to falicitate an employee. So they choose the employee with highest experience. Write a program to help the management by finding the employee ID with highest experience.
// (this is the same problem as A2-P3 but this should be done without using arrays.)

// Input Format:
// first line contains number of employees.
// Second line - ID of 1st Employee
// Third line - age of 1st Employee
// Repeat Second and Third lines of input for all the employees

// Constraints:
// Do not use arrays.

// Output Format:
// Display employee ID with highest age

// Sample Input 0:
// 3
// 1001
// 26
// 1002
// 59
// 1003
// 54
// Sample Output 0:
// Employee ID: 1002 has the highest age: 59
    
// Sample Input 1:
// 5
// 1001
// 26
// 1002
// 59
// 1003
// 64
// 1004
// 37
// 1005
// 43
// Sample Output 1:
// Employee ID: 1003 has the highest age: 64

import java.util.Scanner;

public class A2_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int id = 0, age = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i){
            int temp_id = scanner.nextInt();
            int temp_age = scanner.nextInt();
            if(age < temp_age){
                age = temp_age;
                id = temp_id;
            }
        }
        System.out.printf("Employee ID: %d has the highest age: %d\n",id,age);
    }
}
