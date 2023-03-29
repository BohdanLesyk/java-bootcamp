package round_2.lesson5.task3;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    private String model;
    private String owner;
    private int price;
    private int produceYear;

    public Car() { }

    public Car(String model, String owner, int price, int produceYear) {
        this.model = model;
        this.owner = owner;
        this.price = price;
        this.produceYear = produceYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        return getPrice() == car.getPrice()
                && getProduceYear() == car.getProduceYear()
                && Objects.equals(getModel(), car.getModel())
                && Objects.equals(getOwner(), car.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getOwner(), getPrice(), getProduceYear());
    }

    public static boolean isCarOwnerExistsInList(ArrayList<Car> cars, String owner) {
        for (Car car : cars) {
            if (car.getOwner().equals(owner)) {
                return true;
            }
        }

        return false;
    }
}
