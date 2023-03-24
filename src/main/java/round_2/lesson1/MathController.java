package round_2.lesson1;

public class MathController {
    public static void mathCalculation(String function, double a, double b) {
        switch (function) {
            case "div" -> System.out.println(a / b);
            case "log10" -> System.out.println(Math.log10(a + b));
            case "log" -> System.out.println(Math.log(a + b));
            case "pow" -> System.out.println(Math.pow(a, b));
        }
    }

    public static void mathCalculation(String field, Car car, double number) {
        switch (field) {
            case "price" -> System.out.println(car.getPrice() * number);
            case "weight" -> System.out.println(car.getWeight() * number);
            case "speed" -> System.out.println(car.getSpeed() * number);
        }
    }
}
