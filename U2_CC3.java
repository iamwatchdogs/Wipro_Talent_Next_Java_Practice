// Question:
// Create a class Employee consists of instance variables id, name, branch and use two constructors. First one is for initializing id, second one is for initializing name, branch. id, name and branch values to be taken from the user.

// Input Format:
// First line is id of string type Secind line is name of string type Third line is branch of string type

// Constraints:
// None

// Output Format:
// Refer sample test case

// Sample Input 0:
// 17CS402
// Java Programming
// CSE
// Sample Output 0:
// Id: 17CS402
// Name: Java Programming
// Branch: CSE

import java.util.Scanner;

class Employee{
    private String id;
    private String name;
    private String branch;
    
    Employee(String id){
        this(id,null,null);
    }
    
    Employee(String id, String name, String branch){
        this.id = id;
        this.name = name;
        this.branch = branch;
        
        System.out.printf("Id: %s\n",this.id);
        System.out.printf("Name: %s\n",this.name);
        System.out.printf("Branch: %s\n",this.branch);
    }
}

public class U2_CC3{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String name = scanner.nextLine();
        String branch = scanner.nextLine();
        Employee emp = new Employee(id, name, branch);
    }
}
