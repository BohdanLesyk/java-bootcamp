package round_2.lesson4;

public class PassengerPlane extends Plane {
    private int countPassengerSets;

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
}
