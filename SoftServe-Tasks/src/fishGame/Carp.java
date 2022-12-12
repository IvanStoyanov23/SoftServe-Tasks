public class Carp extends Fish {

    private String color;

    public Carp(String color, int fishWeight) {
        this.color = color;
        setFishWeight(fishWeight);
    }

    public String getColor(String color){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
