package round_2.lesson4;

public class Car extends Auto {
    private String bodyConfiguration;//hatchback, sedan, wagon, etc.

    public Car(int speed, double weight, double length, double width, int passengerCapacity,
               String manufacturerCompany, int engineHorsePower, String engineType, String bodyConfiguration) {
        super(speed, weight, length, width, passengerCapacity, manufacturerCompany, engineHorsePower, engineType);

        this.bodyConfiguration = bodyConfiguration;
    }

    public String getBodyConfiguration() {
        return bodyConfiguration;
    }

    public void setBodyConfiguration(String bodyConfiguration) {
        this.bodyConfiguration = bodyConfiguration;
    }
}
