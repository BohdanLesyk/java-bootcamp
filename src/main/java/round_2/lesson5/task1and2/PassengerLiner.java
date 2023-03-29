package round_2.lesson5.task1and2;

import java.util.Objects;

public class PassengerLiner extends Ship {
    private int cabinCount;// каюти

    public PassengerLiner() { }

    public PassengerLiner(int cabinCount) {
        this.cabinCount = cabinCount;
    }

    public PassengerLiner(String shipType, int cabinCount) {
        super(shipType);

        this.cabinCount = cabinCount;
    }

    public PassengerLiner(int speed, double weight, double length, double width, int passengerCapacity,
                          String manufacturerCompany, String shipType, int cabinCount) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, shipType);

        this.cabinCount = cabinCount;
    }

    public int getCabinCount() {
        return cabinCount;
    }

    public void setCabinCount(int cabinCount) {
        this.cabinCount = cabinCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerLiner that = (PassengerLiner) o;

        return getCabinCount() == that.getCabinCount();
    }

    @Override
    public String toString() {
        return "PassengerLiner{" +
                "cabinCount=" + cabinCount +
                '}';
    }
}
