package round_2.lesson5.task1and2;

import java.util.Objects;

public class Auto extends Vehicle {
    private int engineHorsePower;
    private String engineType;// fuel OR electricity

    public Auto() { }

    public Auto(int engineHorsePower, String engineType) {
        this.engineHorsePower = engineHorsePower;
        this.engineType = engineType;
    }

    public Auto(int speed, double weight, double length, double width, int passengerCapacity,
                String manufacturerCompany, int engineHorsePower, String engineType) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany);

        this.engineHorsePower = engineHorsePower;
        this.engineType = engineType;
    }

    public int getEngineHorsePower() {
        return engineHorsePower;
    }

    public void setEngineHorsePower(int engineHorsePower) {
        this.engineHorsePower = engineHorsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;

        return getEngineHorsePower() == auto.getEngineHorsePower()
                && Objects.equals(getEngineType(), auto.getEngineType());
    }

    @Override
    public String toString() {
        return "Auto{" +
                "engineHorsePower=" + engineHorsePower +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
