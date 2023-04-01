package round_3.lesson2;

public abstract class Vehicle implements Comparable<Vehicle> {
    private int speed;
    private int year;
    private Engine engine;

    public Vehicle() { }

    public Vehicle(int speed, int year, Engine engine) {
        this.speed = speed;
        this.year = year;
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    @Override
    public int compareTo(Vehicle vehicle) {
        return this.speed - vehicle.speed;
    }
}
