package round_2.lesson5.task1and2;

import java.util.Objects;

public class Tanker extends Ship {
    private int tankCount;
    private double tankVolume;

    public Tanker() { }

    public Tanker(int tankCount, double tankVolume) {
        this.tankCount = tankCount;
        this.tankVolume = tankVolume;
    }

    public Tanker(String shipType, int tankCount, double tankVolume) {
        super(shipType);

        this.tankCount = tankCount;
        this.tankVolume = tankVolume;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tanker tanker = (Tanker) o;

        return getTankCount() == tanker.getTankCount()
                && Double.compare(tanker.getTankVolume(), getTankVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTankCount(), getTankVolume());
    }

    @Override
    public String toString() {
        return "Tanker{" +
                "tankCount=" + tankCount +
                ", tankVolume=" + tankVolume +
                '}';
    }
}
