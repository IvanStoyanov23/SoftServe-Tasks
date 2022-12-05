import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number:");

        int num = scanner.nextInt();
        String numStr = String.valueOf(Math.abs(num));

        if (num >= 0) {
            System.out.print("Positive ");

            if ( numStr.length() == 1) {
                System.out.print("one-digit");
            }else if (numStr.length() == 2) {
                System.out.print("two-digit");
            }else if (numStr.length() == 3) {
                System.out.print("three-digit");
            }else if (numStr.length() == 4) {
                System.out.print("four-digit");
            }else if (numStr.length() == 5) {
                System.out.print("five-digit");
            }

        }else {
            System.out.print("Negative ");

            if ( numStr.length() == 1) {
                System.out.print("one-digit");
            }else if (numStr.length() == 2) {
                System.out.print("two-digit");
            }else if (numStr.length() == 3) {
                System.out.print("three-digit");
            }else if (numStr.length() == 4) {
                System.out.print("four-digit");
            }else if (numStr.length() == 5) {
                System.out.print("five-digit");
            }
        }
    }
}