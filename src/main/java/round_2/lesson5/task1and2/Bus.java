package round_2.lesson5.task1and2;

import java.util.Objects;

public class Bus extends Auto {
    private String transportationType;// public transport, school bus, state bus, international, etc.
    public Bus() { }

    public Bus(String transportationType) {
        this.transportationType = transportationType;
    }

    public Bus(int engineHorsePower, String engineType, String transportationType) {
        super(engineHorsePower, engineType);

        this.transportationType = transportationType;
    }

    public Bus(int speed, double weight, double length, double width, int passengerCapacity,
               String manufacturerCompany, int engineHorsePower, String engineType, String transportationType) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, engineType);

        this.transportationType = transportationType;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;

        return Objects.equals(getTransportationType(), bus.getTransportationType());
    }

    @Override
    public String toString() {
        return "Bus{" +
                "transportationType='" + transportationType + '\'' +
                '}';
    }
}
