package round_2.lesson5.task1and2;

import java.util.Objects;

public class TransportPlane extends Plane {
    private String cargoType;
    private double maxCargoWeight;

    public TransportPlane() { }

    public TransportPlane(String cargoType, double maxCargoWeight) {
        this.cargoType = cargoType;
        this.maxCargoWeight = maxCargoWeight;
    }

    public TransportPlane(int engineHorsePower, double wingspanWidth, double flightRange, double flightHeight,
                          int countStuff, int turbineCount, String departureAirfield, String arrivalAirfield,
                          String cargoType, double maxCargoWeight) {
        super(engineHorsePower, wingspanWidth, flightRange, flightHeight, countStuff, turbineCount, departureAirfield, arrivalAirfield);

        this.cargoType = cargoType;
        this.maxCargoWeight = maxCargoWeight;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransportPlane that = (TransportPlane) o;

        return Double.compare(that.getMaxCargoWeight(), getMaxCargoWeight()) == 0
                && Objects.equals(getCargoType(), that.getCargoType());
    }

    @Override
    public String toString() {
        return "TransportPlane{" +
                "cargoType='" + cargoType + '\'' +
                ", maxCargoWeight=" + maxCargoWeight +
                '}';
    }
}
