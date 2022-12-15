import java.util.ArrayList;

public class Car extends Vehicle implements Actions {

    private int speed = 0;

    @Override
    public void startEngine() {
        System.out.println("Engine starts keyless");
        setCurrentSpeed(0);
    }

    @Override
    public void accelerate() {
        System.out.println("Car speed is increased");
        this.speed += 10;
        setCurrentSpeed(this.speed);
    }

    @Override
    public void brake() {
        if (getCurrentSpeed() <= 0) {
            System.out.println("Car is not moving");
            this.speed = 0;
        } else {
            System.out.println("Car speed is decreased");
            this.speed -= 10;
        }
        setCurrentSpeed(this.speed);
    }
}
