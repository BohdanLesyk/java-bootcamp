package round_3.lesson2;

public class Chassis {
    private Wheel wheel;
    private int countWheels;

    public Chassis() { }

    public Chassis(Wheel wheel, int countWheels) {
        this.wheel = wheel;
        this.countWheels = countWheels;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "wheel=" + wheel +
                ", countWheels=" + countWheels +
                '}';
    }
}
