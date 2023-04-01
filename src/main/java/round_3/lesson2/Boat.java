package round_3.lesson2;

public class Boat {
    private int passengerCount;
    private String material;

    public Boat() { }

    public Boat(int passengerCount, String material) {
        this.passengerCount = passengerCount;
        this.material = material;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "passengerCount=" + passengerCount +
                ", material='" + material + '\'' +
                '}';
    }
}
