import java.util.Scanner;

public class Loops_Task_1 {
//    1. Find the sum of all numbers from -5.5 to a with a step of h (the number a
//    is entered from the keyboard).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double a = scanner.nextDouble();
        double h = 0.5;

        for (double i = -5.5; i <= a; i+=h) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
