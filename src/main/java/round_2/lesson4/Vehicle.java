package round_2.lesson4;

public class Vehicle {
    private int speed;
    private double weight;
    private double length;
    private double width;
    private int passengerCapacity;
    private String manufacturerCompany;

    public Vehicle(int speed, double weight, double length, double width, int passengerCapacity,
                   String manufacturerCompany) {
        this.speed = speed;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.passengerCapacity = passengerCapacity;
        this.manufacturerCompany = manufacturerCompany;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getManufacturerCompany() {
        return manufacturerCompany;
    }

    public void setManufacturerCompany(String manufacturerCompany) {
        this.manufacturerCompany = manufacturerCompany;
    }
}
