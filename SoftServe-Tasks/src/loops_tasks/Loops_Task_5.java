import java.util.ArrayList;
import java.util.Scanner;

public class Loops_Task_5 {
//    5. A sequence of integers is entered from the keyboard. Find the average
//    value of all positive numbers in the sequence until a number greater than
//    the specified n is entered .

    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrNums = new ArrayList<Integer>();

        System.out.println("Enter special number:");
        int n = scanner.nextInt();
        System.out.println("Special number: " + n);

        int input = scanner.nextInt();

        while (input < n) {
            if (input >= 0) {
                arrNums.add(input);
            }
            input = scanner.nextInt();
        }

        for (int number : arrNums) {
            sum += number;
        }

        average = sum / arrNums.size();

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: "+ average);
    }
}
