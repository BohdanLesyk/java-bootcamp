package round_2.lesson5.task3;

import java.util.ArrayList;

public class CarController {
    public static boolean isCarOwnerExistsInList(ArrayList<Car> cars, String owner) {
        for (Car car : cars) {
            if (car.getOwner().equals(owner)) {
                return true;
            }
        }

        return false;
    }
}
