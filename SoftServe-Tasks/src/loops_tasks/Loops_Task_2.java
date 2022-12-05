import java.util.Scanner;

public class Loops_Task_2 {
//    2. Processing the data while entering  n integers from the keyboard, find
//    their sum.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int inputNum;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            inputNum = scanner.nextInt();
            sum += inputNum;
        }

        System.out.println("The sum is: " + sum);
    }


}
