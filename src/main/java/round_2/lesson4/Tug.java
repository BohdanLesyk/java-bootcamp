package round_2.lesson4;

public class Tug extends Ship {
    private int tractionForce;// тягове зусилля

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
}
