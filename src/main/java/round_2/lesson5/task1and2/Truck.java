package round_2.lesson5.task1and2;

import java.util.Objects;

public class Truck extends Auto {
    private double loadCapacity;

    public Truck() { }

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Truck(int engineHorsePower, String engineType, double loadCapacity) {
        super(engineHorsePower, engineType);

        this.loadCapacity = loadCapacity;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;

        return Double.compare(truck.getLoadCapacity(), getLoadCapacity()) == 0;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
