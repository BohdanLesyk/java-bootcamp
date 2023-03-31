package round_2.lesson8.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

public class Handler {
    public static void main(String[] args) {
        Random random = new Random();
        List<List<Car>> cars = new ArrayList<>();

        for (int i = 0; i < random.nextInt(5, 10); i++) {
            cars.add(new ArrayList<>());

            for (int j = 0; j < random.nextInt(10, 50); j++) {
                cars.get(i).add(new Car(random.nextInt(100, 300)));
            }
        }

        System.out.println(cars);
        System.out.println("-----------------------------------------------------------");
        List<List<Car>> resultCars = separateCarsByDelimiter.apply(cars, 210);
        System.out.println(resultCars);
    }

    private static final BiFunction<List<List<Car>>, Integer, List<List<Car>>> separateCarsByDelimiter = (cars, delimiter) -> {
        List<List<Car>> result = new ArrayList<>(Arrays.asList(
                new ArrayList<>(),
                new ArrayList<>()
        ));

        for (List<Car> cars1 : cars) {
            for (Car car : cars1) {
                if (car.getMaxSpeed() < delimiter) {
                    result.get(0).add(car);
                } else {
                    result.get(1).add(car);
                }
            }
        }

        return result;
    };
}
