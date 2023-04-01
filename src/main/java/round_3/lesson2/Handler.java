package round_3.lesson2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Handler {
    public static void main(String[] args) {
        ArrayList<Plane> planes = new ArrayList<>(List.of(
                new Plane(
                        3_200, 2018, new Engine("engine3", 8_500),
                        "model3", 2_000,
                        new Chassis(new Wheel(23_000, 900), 6)
                ),
                new Plane(
                        2_800, 2016, new Engine("engine1", 6_500),
                        "model1", 2_000,
                        new Chassis(new Wheel(21_000, 900), 6)
                ),
                new Plane(
                        3_000, 2017, new Engine("engine2", 7_500),
                        "model2", 2_000,
                        new Chassis(new Wheel(25_000, 900), 6)
                ),
                new Plane(
                        4_500, 2022, new Engine("engine4", 10_000),
                        "model1", 2_000,
                        new Chassis(new Wheel(25_000, 900), 6)
                ),
                new Plane(
                        2_800, 2016, new Engine("engine1", 6_500),
                        "model1", 2_000,
                        new Chassis(new Wheel(21_000, 900), 6)
                )
        ));

        Collections.sort(planes);

        ArrayList<Ship> ships = new ArrayList<>(List.of(
                new Ship(90, 2019, new Engine("engine2", 20_000), 20_000, 200,
                        new Boat(20, "material2")),
                new Ship(60, 2014, new Engine("engine1", 15_000), 15_000, 150,
                        new Boat(15, "material1")),
                new Ship(100, 2022, new Engine("engine3", 30_000), 30_000, 300,
                        new Boat(30, "material3")),
                new Ship(80, 2019, new Engine("engine2", 25_000), 25_000, 250,
                        new Boat(25, "material2")),
                new Ship(50, 2012, new Engine("engine1", 10_000), 10_000, 100,
                        new Boat(10, "material1"))
        ));

        Collections.sort(ships);

        System.out.println(ships);
        FileController.writeObjectsToFile(new File("src/OutputFiles/SHIPS.ser"), new ArrayList<>(ships));
        ArrayList<Vehicle> ships1 = FileController.readObjectsFromFile(new File("src/OutputFiles/SHIPS.ser"));
        System.out.println(ships1);

        System.out.println(planes);
        FileController.writeObjectsToFile(new File("src/OutputFiles/PLANES.ser"), new ArrayList<>(planes));
        ArrayList<Vehicle> planes1 = FileController.readObjectsFromFile(new File("src/OutputFiles/PLANES.ser"));
        System.out.println(planes1);
    }
}
