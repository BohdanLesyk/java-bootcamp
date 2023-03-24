package round_2.lesson1;

public class CarFixingController {
    public static void fixCarByDriver(Car car) {
        Driver.fixCar(car);
    }

    public static void fixCarByAutoServiceStation(Car car) {
        AutoServiceStation.fixCar(car);
    }
}
