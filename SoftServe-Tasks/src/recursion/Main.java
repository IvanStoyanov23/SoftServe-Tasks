import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(Sum(n));
    }
    public static int Sum(int n) {


        if (n == 1) {
//            Base Case
            return 1;
        }else {
//            Recursive Procedure
            return (Sum(n - 1) + n);
        }
    }
}