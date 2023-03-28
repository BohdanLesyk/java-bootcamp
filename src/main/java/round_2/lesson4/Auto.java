package round_2.lesson4;

public class Auto extends Vehicle {
    private int engineHorsePower;
    private String engineType;// fuel OR electricity

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
}
