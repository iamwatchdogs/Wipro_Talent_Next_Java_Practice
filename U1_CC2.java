// Question:
// Five Bikers Compete in a race such that they drive at a constant speed which may or may not be the same as the other. To qualify the race, the speed of a racer must be more than the average speed of all 5 racers. Take as input the speed of each racer and print back the speed of qualifying racers.

// Input Format:
// Space separted five float numbers

// Constraints:
// None

// Output Format:
// Speed of qualifying racers in separate lines.

// Sample Input 0:
// 12.4 47.8 69.1 51.4 55.7
// Sample Output 0:
// 47.8
// 69.1
// 51.4
// 55.7
    
import java.util.Scanner;

public class U1_CC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] arr = new double[5];
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextDouble();
            avg += arr[i];
        }
        avg /= arr.length;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > avg){
                System.out.println(arr[i]);
            }
        }
    }
}
