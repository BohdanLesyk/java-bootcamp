package round_2.lesson4;

public class PassengerLiner extends Ship {
    private int cabinCount;// каюти

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
}
