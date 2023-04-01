package round_3.lesson2;

import java.io.*;
import java.util.ArrayList;

public class FileController {
    public static void writeObjectsToFile(File file, ArrayList<Vehicle> vehicles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Vehicle vehicle : vehicles) {
                oos.writeObject(vehicle);
            }

            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Vehicle> readObjectsFromFile(File file) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Vehicle vehicle;

            while (true) {
                vehicle = (Vehicle) ois.readObject();
                vehicles.add(vehicle);
            }
        } catch (EOFException ignored) {

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return vehicles;
    }
}
