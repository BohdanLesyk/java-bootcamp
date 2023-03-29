package round_2.lesson5.task1and2;

import java.util.Objects;

public class Vehicle {
    private int speed;
    private double weight;
    private double length;
    private double width;
    private int passengerCapacity;
    private String manufacturerCompany;

    public Vehicle() { }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;

        return speed == vehicle.speed
                && Double.compare(vehicle.weight, weight) == 0
                && Double.compare(vehicle.length, length) == 0
                && Double.compare(vehicle.width, width) == 0
                && passengerCapacity == vehicle.passengerCapacity
                && Objects.equals(manufacturerCompany, vehicle.manufacturerCompany);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", passengerCapacity=" + passengerCapacity +
                ", manufacturerCompany='" + manufacturerCompany + '\'' +
                '}';
    }
}
