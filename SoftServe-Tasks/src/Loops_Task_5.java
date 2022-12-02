import java.util.ArrayList;
import java.util.Scanner;

public class Loops_Task_5 {
//    5. A sequence of integers is entered from the keyboard. Find the average
//    value of all positive numbers in the sequence until a number greater than
//    the specified n is entered .

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter special number:");
        int n = scanner.nextInt();
        System.out.println("Special number: " + n);

        int input = scanner.nextInt();

        int sum = 0;

        ArrayList<Integer> arrNums = new ArrayList<Integer>();

        while (input != n) {
            arrNums.add(input);
            input = scanner.nextInt();
        }

        for (int i = 0; i < arrNums.size(); i++) {
            if (arrNums.get(i) >= 0) {
                sum += arrNums.get(i);
            }
        }

        System.out.println(sum);
    }
}
