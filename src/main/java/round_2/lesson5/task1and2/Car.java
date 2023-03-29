package round_2.lesson5.task1and2;

import java.util.Objects;

public class Car extends Auto {
    private String bodyConfiguration;//hatchback, sedan, wagon, etc.

    public Car() { }

    public Car(String bodyConfiguration) {
        this.bodyConfiguration = bodyConfiguration;
    }

    public Car(int engineHorsePower, String engineType, String bodyConfiguration) {
        super(engineHorsePower, engineType);

        this.bodyConfiguration = bodyConfiguration;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;

        return Objects.equals(getBodyConfiguration(), car.getBodyConfiguration());
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyConfiguration='" + bodyConfiguration + '\'' +
                '}';
    }
}
