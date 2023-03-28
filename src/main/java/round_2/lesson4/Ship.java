package round_2.lesson4;

public class Ship extends Vehicle {
    private String shipType;//City river taxi, ferry, shortDistance, longDistance, etc.

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
}
