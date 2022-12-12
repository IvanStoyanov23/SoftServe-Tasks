public class SheatFish extends Fish{
    private int whisckerLength;

    public SheatFish(int whisckerLength, int fishWeight) {
        this.whisckerLength = whisckerLength;
        setFishWeight(fishWeight);
    }

    public int getWhisckerLength(int whisckerLength){
        return whisckerLength;
    }

    public void setWhisckerLength(int whisckerLength) {
        this.whisckerLength = whisckerLength;
    }
}
