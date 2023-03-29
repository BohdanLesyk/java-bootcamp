package round_2.lesson5.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Handler {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("BMW", "John Doe", 7_000, 2015),
                new Car("Audi", "Luck Besson", 45_000, 2023),
                new Car("Mercedes", "Jason Statham", 100_000, 2023),
                new Car("Porsche", "Bruce Willis", 120_000, 2023),
                new Car("Skoda", "Louis Viton", 30_000, 2022),
                new Car("Pontiac", "Serg", 15_000, 2020)
        ));

        System.out.println(
                cars.contains(
                        new Car("Pontiac", "Serg", 15_000, 2020)
                )
        );

        System.out.println(Car.isCarOwnerExistsInList(cars, "Serg"));
        System.out.println(CarController.isCarOwnerExistsInList(cars, "Angelina Jolie"));
    }
}
