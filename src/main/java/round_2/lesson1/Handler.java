package round_2.lesson1;

public class Handler {
    public static void main(String[] args) {
        Car porscheCayenne = new Car("Porsche Cayenne");
        Car audiA6 = new Car("Audi A6");

        CarFixingController.fixCarByDriver(porscheCayenne);
        CarFixingController.fixCarByAutoServiceStation(audiA6);

        Car car = new Car("Honda Civic", 25500, 2100, 210);

        MathController.mathCalculation("div", 10, 5);
        MathController.mathCalculation("log10", 1000, 10);
        MathController.mathCalculation("log", 25, 2);
        MathController.mathCalculation("pow", 5, 3);

        MathController.mathCalculation("price", car, 2);
        MathController.mathCalculation("weight", car, 2.5);
        MathController.mathCalculation("speed", car, 1.5);
    }
}
