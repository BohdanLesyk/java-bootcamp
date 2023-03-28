package round_2.lesson4;

public class Bus extends Auto {
    private String transportationType;// public transport, school bus, state bus, international, etc.

    public Bus(int speed, double weight, double length, double width, int passengerCapacity,
               String manufacturerCompany, int engineHorsePower, String engineType, String transportationType) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, engineType);

        this.transportationType = transportationType;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }
}
