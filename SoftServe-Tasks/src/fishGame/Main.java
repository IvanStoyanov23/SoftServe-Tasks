import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                        "1. View capacity;\n" +
                        "2. View state of Pond;\n" +
                        "3. Add fish( Carp, Shark or SheatFish);\n" +
                        "4. Catch fish (Choose quantity to catch);\n" +
                        "5. Finish the game.");

        String input = scanner.nextLine();

        Pond pond = new Pond();

        while (input != "5"){

            if (input.equals("1"))
            {
                pond.showCapacity();
            }else if (input.equals("2"))
            {
                System.out.println(pond.getPondStatus());
            }else if (input.equals("3"))
            {
                System.out.println("Carp, Shark or Sheatfish?");
                String type = scanner.nextLine().toLowerCase();

                System.out.println("How much KG does the fish weight?");
                int weight = scanner.nextInt();

                if (type.equals("carp")){
                    System.out.println("What is the color of the fish?");
                    String color = scanner.nextLine();

                    Carp carp = new Carp(color, weight);
                    pond.catchFish(carp);

                }else if (type.equals("shark")){
                    System.out.println("What is the length fish?");
                    int length = scanner.nextInt();

                    Shark shark = new Shark(length, weight);
                    pond.catchFish(shark);
                }else if (type.equals("sheatfish")){
                    System.out.println("how much cm are the wiskers length?");
                    int whiskers = scanner.nextInt();

                    SheatFish sheatFish = new SheatFish(whiskers,weight);
                    pond.catchFish(sheatFish);
                }
            }else if (input.equals("4"))
            {
                System.out.println("Enter how much fishes you want to catch: ");
                input = scanner.nextLine();
                int fishQuantity = Integer.parseInt(input);

                if (fishQuantity > pond.getCapacity().size()) {
                    System.out.println("The quantity you try to catch is bigger than the capacity.");
                }else{
                    pond.lostFish(fishQuantity);
                }
            }

            input = scanner.nextLine();
        }

    }
}