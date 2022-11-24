import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCity = scanner.nextLine().toLowerCase();

        HashMap<String, ArrayList<String>> countries = new HashMap<String, ArrayList<String>>();

        countries.put("Bulgaria", new ArrayList<String>());
        countries.get("Bulgaria").add("sofia");
        countries.get("Bulgaria").add("plovdiv");
        countries.get("Bulgaria").add("varna");
        countries.get("Bulgaria").add("burgas");

        countries.put("USA", new ArrayList<String>());
        countries.get("USA").add("new York");
        countries.get("USA").add("miami");
        countries.get("USA").add("florida");

        countries.forEach((key, value) -> {

            if (value.contains(inputCity)) {
                System.out.println(key);
                return;
            }
        });
    }
}
