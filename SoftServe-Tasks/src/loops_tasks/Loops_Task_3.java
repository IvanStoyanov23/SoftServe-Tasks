import java.util.Scanner;

public class Loops_Task_3 {
//    3. Calculate the sum of 1! + 2! + 3! + ... + n !, n <10.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        int f = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            sum = sum + f;
            f = 1;
        }

        System.out.println("Factorial sum is: " + sum);
    }


}
