// Question:
// The retail store management wants to automate the process of generating the bill amount for its customers.
// The business rules/constraints are as given below:
// 1. Item id's sold by the store are 5001, 5002, 5003, 5004 and 5005.User can buy any number of items
// 2. Rates of items are 5001 - Rs.20, 5002 - Rs.25, 5003 - Rs.30, 5004 - Rs.40 and 5005 - Rs.50
// 3. There is 20% discount on items 5004 and 5005.
// Calculate bill amount.

// Input Format:
// First Line: User enters item id
// Second Line: User enters Quantity
// Third Line: User enters Y to enter one more item, otherwise N.
// Repeat these three lines untill user enters N.
// Refer Sample input and output

// Constraints:
// Assume user always enters Quatity of item greater than zero.

// Output Format:
// Display total bill

// Sample Input 0:
// 5001
// 10
// Y
// 5002
// 10
// Y
// 5003
// 10
// N
// Sample Output 0:
// Total Bill: 750.0
    
// Sample Input 1:
// 5004
// 5
// Y
// 5005
// 10
// N
// Sample Output 1:
// Total Bill: 560.0

import java.util.Scanner;

public class A1_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuePurchase = 'Y';
        double finalBill = 0.0;
        
        while(continuePurchase == 'Y') {
            int id = scanner.nextInt();
            int quantity = scanner.nextInt();
            
            int price = returnPriceForId(id);
            if(price < 0){
                System.out.println("Enter valid item number");
                System.exit(0);
            }
            
            finalBill += quantity * price;
            if(id == 5004 || id == 5005)    { finalBill -= quantity*price*0.2; }
            
            continuePurchase = scanner.next().charAt(0);
        }
        System.out.println("Total Bill: " + finalBill);
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
