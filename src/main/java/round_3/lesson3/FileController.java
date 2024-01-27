package round_3.lesson3;

import java.io.*;
import java.util.Map;

public class FileController {
    public static void writeLinesToFile(Map<Line, Integer> lines, File file) {
        System.out.println("Begin writing lines into file '" + file + "' ...");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Writing lines into file '" + file + "' has completed successfully!");
    }

    public static void writePointsToFile(Map<Point, Integer> points, File file, boolean append) {
        System.out.println("Begin writing points into file '" + file + "' ...");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, append))) {
            objectOutputStream.writeObject(points);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Writing points into file '" + file + "' has completed successfully!");
    }

    public static void readLinesFromFile(File file) {
        System.out.println("Begin reading lines from file '" + file + "' ...");
        Map<Line, Integer> lines;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            lines = (Map<Line, Integer>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(lines);
    }

    public static void readPointsFromFile(File file) {
        System.out.println("Begin reading points from file '" + file + "' ...");
        Map<Point, Integer> points;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            points = (Map<Point, Integer>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(points);
    }
}
