package round_3.lesson3;

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dispatcher {
    public static void main(String[] args) {
        Set<Point> points = new HashSet<>(Set.of(
                new Point("A", 3, 3),
                new Point("B", 0, 0),
                new Point("C", -3, 3),
                new Point("D", -6, 6),
                new Point("E", 6, 6),
                new Point("F", 6, -6),
                new Point("G", -6, -6),
                new Point("H", -2, -6),
                new Point("I", 4, 6),
                new Point("J", -5, 1),
                new Point("K", 4, -3),
                new Point("L", -4, -3),
                new Point("M", -6, 0),
                new Point("N", 6, 0),
                new Point("O", 0, -6),
                new Point("P", 0, 6)
        ));

        Map<Line, Integer> linesWithPointsCount = SpaceController.createLines(points);
        Map<Point, Integer> pointWithLinesIntersectionCount = SpaceController.createPoints(points, linesWithPointsCount);

        linesWithPointsCount.forEach((line, pointsCount) -> System.out.println(pointsCount + " points on line: " + line));
        System.out.println();
        pointWithLinesIntersectionCount.forEach((point, linesCount) -> System.out.println("Point: " + point + " with count of lines intercepted on it: " + linesCount));

        File linesWithPoints = new File("src/OutputFiles/r3-lesson3-LINES-WITH-POINTS.ser");
        File pointWithLinesIntersection = new File("src/OutputFiles/r3-lesson3-POINT-WITH-LINES.ser");

        FileController.writeLinesToFile(linesWithPointsCount, linesWithPoints);
        FileController.writePointsToFile(pointWithLinesIntersectionCount, pointWithLinesIntersection, true);

        System.out.println();

        FileController.readLinesFromFile(linesWithPoints);
        FileController.readPointsFromFile(pointWithLinesIntersection);
    }
}
