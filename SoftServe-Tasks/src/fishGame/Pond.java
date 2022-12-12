import java.util.ArrayList;

public class Pond {
    private ArrayList<Fish> capacity;
    private String pondStatus;

    public Pond() {
        this.capacity = new ArrayList<>();
    }
    public ArrayList<Fish> getCapacity() {
        return capacity;
    }

    public void setCapacity(ArrayList<Fish> capacity) {
        this.capacity = new ArrayList<>();
    }

    public void showCapacity(){
        System.out.println(this.capacity.size());
    }

    public String getPondStatus(){
        if (capacity.size() >= 0 && capacity.size() < 5) {
            pondStatus = "poor";
        } else if (capacity.size() >= 5 && capacity.size() <= 10) {
            pondStatus = "normal";
        } else if (capacity.size() > 10) {
            pondStatus = "rich";
        }
        return pondStatus;
    }

    public void catchFish(Fish fish){

        capacity.add(fish);
    }

    public void lostFish(int lostNumFish){

        if (capacity.size() == 0){
            System.out.println("The pond is empty.");
            return;
        }

        for (int i = 0; i < lostNumFish; i++) {
            capacity.remove(0);
        }
    }

}
