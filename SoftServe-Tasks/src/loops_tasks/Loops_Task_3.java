import java.util.Scanner;

public class Loops_Task_3 {
//    3. Calculate the sum of 1! + 2! + 3! + ... + n !, n <10.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {

            long f = getFactorial(i);
            sum = sum + f;
        }

        System.out.println("Factorial sum is: " + sum);
    }

//    Factorial recursion
    public static long getFactorial(int num)
    {
        if (num >= 1)
            return num * getFactorial(num - 1);
        else
            return 1;
    }


}
