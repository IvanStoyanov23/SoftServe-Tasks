import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number! Please enter number: ");

        int input = scanner.nextInt();

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        int randomNum = (int)(Math.random() * range) + min;

        System.out.println("The number is: " + randomNum);

        int leftAttempt = 9;

        for (int i = 1; i <= 10; i++) {
            input = scanner.nextInt();

            System.out.format("Attempt left: %d \n", leftAttempt);

            if (input == randomNum) {
                System.out.println("Congrats, you guessed the number: " + randomNum);
                break;
            } else if (input > randomNum) {
                System.out.println("The number you've entered is bigger than the gussing number!");
            } else if (input < randomNum) {
                System.out.println("The number you've entered is lower than the gussing number!");
            }

            leftAttempt--;
        }
    }
}
