public class Shark extends Fish{
    private int length;

    public Shark(int length, int fishWeight) {
        this.length = length;
        setFishWeight(fishWeight);
    }

    public int getLength(int length){
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
