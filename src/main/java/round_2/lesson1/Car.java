package round_2.lesson1;

public class Car {
    private final String brandName;
    private double price;
    private double weight;
    private double speed;

    public Car(String brandName) {
        this.brandName = brandName;
    }

    public Car(String brandName, double price, double weight, double speed) {
        this.brandName = brandName;
        this.price = price;
        this.weight = weight;
        this.speed = speed;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }
}
