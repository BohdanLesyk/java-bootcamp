package round_2.lesson5.task1and2;

import java.util.Objects;

public class Tug extends Ship {
    private int tractionForce;// тягове зусилля

    public Tug() { }

    public Tug(int tractionForce) {
        this.tractionForce = tractionForce;
    }

    public Tug(String shipType, int tractionForce) {
        super(shipType);

        this.tractionForce = tractionForce;
    }

    public Tug(int speed, double weight, double length, double width, int passengerCapacity,
               String manufacturerCompany, String shipType, int tractionForce) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, shipType);

        this.tractionForce = tractionForce;
    }

    public int getTractionForce() {
        return tractionForce;
    }

    public void setTractionForce(int tractionForce) {
        this.tractionForce = tractionForce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tug tug = (Tug) o;

        return getTractionForce() == tug.getTractionForce();
    }

    @Override
    public String toString() {
        return "Tug{" +
                "tractionForce=" + tractionForce +
                '}';
    }
}
