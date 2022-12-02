import java.util.Scanner;

public class Loops_Task_4 {
//    4. Display the multiplication table by 7:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 7;
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            sum = i * n;
            System.out.println(i + " x " + n + " = " + sum);

        }
    }
}
