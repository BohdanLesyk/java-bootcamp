package round_2.lesson4;

public class Tanker extends Ship {
    private int tankCount;
    private double tankVolume;

    public Tanker(int speed, double weight, double length, double width, int passengerCapacity,
                  String manufacturerCompany, String shipType, int tankCount, double tankVolume) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, shipType);

        this.tankCount = tankCount;
        this.tankVolume = tankVolume;
    }

    public int getTankCount() {
        return tankCount;
    }

    public void setTankCount(int tankCount) {
        this.tankCount = tankCount;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }
}
