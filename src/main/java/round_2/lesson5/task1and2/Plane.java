package round_2.lesson5.task1and2;

import java.util.Objects;

public class Plane extends Vehicle {
    private int engineHorsePower;
    private double wingspanWidth;
    private double flightRange;
    private double flightHeight;
    private int countStuff;
    private int turbineCount;
    private String departureAirfield;
    private String arrivalAirfield;

    public Plane() { }

    public Plane(int engineHorsePower, double wingspanWidth, double flightRange, double flightHeight, int countStuff,
                 int turbineCount, String departureAirfield, String arrivalAirfield) {
        this.engineHorsePower = engineHorsePower;
        this.wingspanWidth = wingspanWidth;
        this.flightRange = flightRange;
        this.flightHeight = flightHeight;
        this.countStuff = countStuff;
        this.turbineCount = turbineCount;
        this.departureAirfield = departureAirfield;
        this.arrivalAirfield = arrivalAirfield;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;

        return getEngineHorsePower() == plane.getEngineHorsePower()
                && Double.compare(plane.getWingspanWidth(), getWingspanWidth()) == 0
                && Double.compare(plane.getFlightRange(), getFlightRange()) == 0
                && Double.compare(plane.getFlightHeight(), getFlightHeight()) == 0
                && getCountStuff() == plane.getCountStuff()
                && getTurbineCount() == plane.getTurbineCount()
                && Objects.equals(getDepartureAirfield(), plane.getDepartureAirfield())
                && Objects.equals(getArrivalAirfield(), plane.getArrivalAirfield());
    }

    @Override
    public String toString() {
        return "Plane{" +
                "engineHorsePower=" + engineHorsePower +
                ", wingspanWidth=" + wingspanWidth +
                ", flightRange=" + flightRange +
                ", flightHeight=" + flightHeight +
                ", countStuff=" + countStuff +
                ", turbineCount=" + turbineCount +
                ", departureAirfield='" + departureAirfield + '\'' +
                ", arrivalAirfield='" + arrivalAirfield + '\'' +
                '}';
    }
}
