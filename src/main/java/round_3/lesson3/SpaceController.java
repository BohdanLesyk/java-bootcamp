package round_3.lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpaceController {
    public static Map<Point, Integer> createPoints(Set<Point> points, Map<Line, Integer> lines) {
        Map<Point, Integer> pointsWithLinesIntersectionCount = new HashMap<>();
        int countLinesOnPoint;

        for (Point point : points) {
            countLinesOnPoint = 0;

            for (Line line : lines.keySet()) {
                if (line.isContainPoint(point)) {
                    countLinesOnPoint++;
                }
            }

            pointsWithLinesIntersectionCount.put(point, countLinesOnPoint);
        }

        return pointsWithLinesIntersectionCount;
    }

    public static Map<Line, Integer> createLines(Set<Point> points) {
        Map<Line, Integer> linesWithPointsCount = new HashMap<>();
        Line line;

        for (Point outerPoint : points) {
            for (Point innerPoint : points) {
                line = new Line();
                line.addPoint(outerPoint);
                line.addPoint(innerPoint);

                if (line.getPoints().size() > 1) {
                    for (Point point : points) {
                        line.addPoint(point);
                    }

                    if (!linesWithPointsCount.containsKey(line)) {
                        linesWithPointsCount.put(line, line.getPoints().size());
                    }
                }
            }
        }

        return linesWithPointsCount;
    }
}
