import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();

        HashMap<String, Vehicle> carGarage = new HashMap<String, Vehicle>();

        nissan.setModel("GTR");
        nissan.setColor("White");

        carGarage.put(nissan.getModel(), nissan);

        System.out.println(nissan.getModel());

        nissan.startEngine();
        nissan.accelerate();
        nissan.accelerate();
        nissan.accelerate();
        System.out.println(nissan.getCurrentSpeed());
        nissan.brake();
        nissan.brake();
        System.out.println(nissan.getCurrentSpeed());

    }
}