import java.util.ArrayList;

public class Train extends Vehicle implements Actions {

    private ArrayList<String> trailer = new ArrayList<String>();
    private int speed = 0;

    @Override
    public void startEngine() {
        System.out.println("Engine starts with switch");
        setCurrentSpeed(0);
    }

    @Override
    public void accelerate() {
        System.out.println("Train speed is increased");
        this.speed += 20;
        setCurrentSpeed(this.speed);
    }

    @Override
    public void brake() {
        if (getCurrentSpeed() <= 0) {
            System.out.println("Train is not moving");
            this.speed = 0;
        } else {
            System.out.println("Train speed is decreased");
            this.speed -= 15;
        }
        setCurrentSpeed(this.speed);
    }

    public void setTrailer(String product1) {
        this.trailer.add(product1);
    }

    public void setTrailer(String product1, String product2) {
        this.trailer.add(product1);
        this.trailer.add(product2);
    }
}
