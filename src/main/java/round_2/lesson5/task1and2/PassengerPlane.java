package round_2.lesson5.task1and2;

import java.util.Objects;

public class PassengerPlane extends Plane {
    private int countPassengerSets;

    public PassengerPlane() { }

    public PassengerPlane(int countPassengerSets) {
        this.countPassengerSets = countPassengerSets;
    }

    public PassengerPlane(int engineHorsePower, double wingspanWidth, double flightRange, double flightHeight,
                          int countStuff, int turbineCount, String departureAirfield, String arrivalAirfield,
                          int countPassengerSets) {
        super(engineHorsePower, wingspanWidth, flightRange, flightHeight, countStuff, turbineCount, departureAirfield, arrivalAirfield);

        this.countPassengerSets = countPassengerSets;
    }

    public PassengerPlane(int speed, double weight, double length, double width, int passengerCapacity,
                          String manufacturerCompany, int engineHorsePower, double wingspanWidth, double flightRange,
                          double flightHeight, int countStuff, int turbineCount, String departureAirfield,
                          String arrivalAirfield, int countPassengerSets) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, wingspanWidth,
                flightRange, flightHeight, countStuff, turbineCount, departureAirfield, arrivalAirfield);

        this.countPassengerSets = countPassengerSets;
    }

    public int getCountPassengerSets() {
        return countPassengerSets;
    }

    public void setCountPassengerSets(int countPassengerSets) {
        this.countPassengerSets = countPassengerSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;

        return getCountPassengerSets() == that.getCountPassengerSets();
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "countPassengerSets=" + countPassengerSets +
                '}';
    }
}
