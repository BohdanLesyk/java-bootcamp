package round_2.lesson4;

public class Plane extends Vehicle {
    private int engineHorsePower;
    private double wingspanWidth;
    private double flightRange;
    private double flightHeight;
    private int countStuff;
    private int turbineCount;
    private String departureAirfield;
    private String arrivalAirfield;

    public Plane(int speed, double weight, double length, double width, int passengerCapacity,
                 String manufacturerCompany, int engineHorsePower, double wingspanWidth, double flightRange,
                 double flightHeight, int countStuff, int turbineCount, String departureAirfield,
                 String arrivalAirfield) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany);

        this.engineHorsePower = engineHorsePower;
        this.wingspanWidth = wingspanWidth;
        this.flightRange = flightRange;
        this.flightHeight = flightHeight;
        this.countStuff = countStuff;
        this.turbineCount = turbineCount;
        this.departureAirfield = departureAirfield;
        this.arrivalAirfield = arrivalAirfield;
    }

    public int getEngineHorsePower() {
        return engineHorsePower;
    }

    public void setEngineHorsePower(int engineHorsePower) {
        this.engineHorsePower = engineHorsePower;
    }

    public double getWingspanWidth() {
        return wingspanWidth;
    }

    public void setWingspanWidth(double wingspanWidth) {
        this.wingspanWidth = wingspanWidth;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    public double getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(double flightHeight) {
        this.flightHeight = flightHeight;
    }

    public int getCountStuff() {
        return countStuff;
    }

    public void setCountStuff(int countStuff) {
        this.countStuff = countStuff;
    }

    public int getTurbineCount() {
        return turbineCount;
    }

    public void setTurbineCount(int turbineCount) {
        this.turbineCount = turbineCount;
    }

    public String getDepartureAirfield() {
        return departureAirfield;
    }

    public void setDepartureAirfield(String departureAirfield) {
        this.departureAirfield = departureAirfield;
    }

    public String getArrivalAirfield() {
        return arrivalAirfield;
    }

    public void setArrivalAirfield(String arrivalAirfield) {
        this.arrivalAirfield = arrivalAirfield;
    }
}
