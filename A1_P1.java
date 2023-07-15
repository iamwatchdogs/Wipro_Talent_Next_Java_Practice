// Question:
// The retail store management wants to automate the process of generating the bill amount for its customers.
// The business rules/constraints are as given below:
// 1. Item id's sold by the store are 5001, 5002, 5003, 5004 and 5005.User can buy only one item with any quantity
// 2. Rates of items are 5001 - Rs.20, 5002 - Rs.25, 5003 - Rs.30, 5004 - Rs.40 and 5005 - Rs.50
// 3. There is 20% discount on items 5004 and 5005.
// Calculate bill amount.

// Input Format:
// First Line: User enters item id
// Second Line: User enters item quantity

// Constraints:
// Assume user always enters Quantity of item greater than zero.

// Output Format:
// Display total bill

// Sample Input 0:
// 5003
// 15
// Sample Output 0:
// total bill: 450.0
    
// Sample Input 1:
// 5005
// 10
// Sample Output 1:
// total bill: 400.0

// Sample Input 2:
// 5006
// 10
// Sample Output 2:
// Enter valid item number

import java.util.Scanner;

public class A1_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int id = scanner.nextInt();
        int quantity = scanner.nextInt();
        
        double bill = quantity * returnPriceForId(id);
        
        if(bill < 0) {
            System.out.println("Enter valid item number");
            System.exit(0);
        } else if (id == 5004 || id == 5005) {
            bill -= bill*0.2;
        }
        System.out.println("total bill: " + bill);
    }
    
    public static int returnPriceForId (int id) {
        switch(id) {
            case 5001:
                return 20;
            case 5002:
                return 25;
            case 5003:
                return 30;
            case 5004:
                return 40;
            case 5005:
                return 50;
        }
        return -1;
    }
}
