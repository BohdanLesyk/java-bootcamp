package round_2.lesson4;

public class TransportPlane extends Plane {
    private String cargoType;
    private double maxCargoWeight;

    public TransportPlane(int speed, double weight, double length, double width, int passengerCapacity,
                          String manufacturerCompany, int engineHorsePower, double wingspanWidth, double flightRange,
                          double flightHeight, int countStuff, int turbineCount, String departureAirfield,
                          String arrivalAirfield, String cargoType, double maxCargoWeight) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, wingspanWidth,
                flightRange, flightHeight, countStuff, turbineCount, departureAirfield, arrivalAirfield);

        this.cargoType = cargoType;
        this.maxCargoWeight = maxCargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(double maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }
}
