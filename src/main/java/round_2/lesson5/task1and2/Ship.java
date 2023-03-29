package round_2.lesson5.task1and2;

import java.util.Objects;

public class Ship extends Vehicle {
    private String shipType;//City river taxi, ferry, shortDistance, longDistance, etc.

    public Ship() { }

    public Ship(String shipType) {
        this.shipType = shipType;
    }

    public Ship(int speed, double weight, double length, double width, int passengerCapacity,
                String manufacturerCompany, String shipType) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany);

        this.shipType = shipType;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ship ship = (Ship) o;

        return Objects.equals(getShipType(), ship.getShipType());
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipType='" + shipType + '\'' +
                '}';
    }
}
