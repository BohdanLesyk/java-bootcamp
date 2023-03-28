package round_2.lesson4;

public class Truck extends Auto {
    private double loadCapacity;

    public Truck(int speed, double weight, double length, double width, int passengerCapacity,
                 String manufacturerCompany, int engineHorsePower, String engineType, double loadCapacity) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, engineType);

        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
