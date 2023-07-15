// Question:
// In a particular calendar month, first day of the month and today's date are entered. Find out today's day

// Input Format:
// First line of input - first day of the month entered by user.
// Second line of input - Today's date is entered by user.

// Output Format:
// Display today's day

// Sample Input 0:
// Thursday
// 24
// Sample Output 0:
// Saturday

// Sample Input 1:
// Saturday
// 25
// Sample Output 1:
// Tuesday

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A1_P5{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        String day = scanner.nextLine();
        int date = scanner.nextInt();
        
        ArrayList<String> days = new ArrayList<>();
        for(String d: new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}) {
            days.add(d);
        }
        
        List<String> rearrangedDays = days.subList(days.indexOf(day),days.size());
        rearrangedDays.addAll(days.subList(0,days.indexOf(day)));
        
        System.out.println(rearrangedDays.get((date%7)-1));
        
    }
}
