package round_3.lesson3;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Line implements Serializable {
    @Serial
    private static final long serialVersionUID = 7_886_055_676_839_813_580L;
    private double K;
    private double B;
    private final Set<Point> points;
    private boolean isVertical = false;
    private boolean isHorizontal = false;

    public Line() {
        this.points = new HashSet<>();
    }

    public Line(Set<Point> points) {
        this.points = points;
    }

    public double getK() {
        return this.K;
    }

    private void setK(double K) {
        this.K = K;
    }

    public double getB() {
        return this.B;
    }

    private void setB(double B) {
        this.B = B;
    }

    public Set<Point> getPoints() {
        return Set.copyOf(this.points);
    }

    public boolean isVertical() {
        return isVertical;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    public void setHorizontal(boolean horizontal) {
        isHorizontal = horizontal;
    }

    /**
     * Adding point to the Line calculated with the next formula: <br>
     *
     * <pre>
     *     y = mx + b;
     *     m (slope) = rise / run
     *
     *     <b>b</b> is <b>`y`</b> intersection of Point
     * </pre>
     * Any line reads from left to right side <br>
     * Direction does not matter
     *
     * @param point the Point for insertion
     */
    public void addPoint(Point point) {
        if (this.points.size() < 2) {
            this.points.add(point);

            if (this.points.size() == 2) {
                this.setK(calculateSlope());
                this.setB(calculateYInterception());
            }

            return;
        }

        if (this.isVertical()) {
            for (Point p : this.getPoints()) {
                if (p.getX() == point.getX()) {
                    this.points.add(point);

                    return;
                }
            }

            return;
        } else if (this.isHorizontal()) {
            for (Point p : this.getPoints()) {
                if (p.getY() == point.getY()) {
                    this.points.add(point);

                    return;
                }
            }

            return;
        }

        if (!isContainPoint(point) && point.isLyingOnLine(this)) {
            this.points.add(point);
        }
    }

    public boolean isContainPoint(Point p) {
        boolean isExists = false;

        for (Point point : this.getPoints()) {
            if (point.equals(p)) {
                isExists = true;
                break;
            }
        }

        return isExists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;

        return Double.compare(line.getK(), getK()) == 0
                && Double.compare(line.getB(), getB()) == 0
                && Objects.equals(getPoints(), line.getPoints());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getK(), getB(), getPoints());
    }

    @Override
    public String toString() {
        return "Line{" +
                "K=" + new DecimalFormat("#.##").format(this.getK()) +
                ", B=" + new DecimalFormat("#.##").format(this.getB()) +
                ", points=" + this.getPoints() +
                '}';
    }

    /**
     * The Slope of the line is calculating by next formula:
     * <pre>m (slope) = rise / run</pre>
     * Here <b>run</b> is the change in horizontal distance, or the difference between x-values of the same two points. <br>
     * Here <b>raise</b> is the change in vertical distance, or the difference between the y-values of the two points.
     *
     * @return value of a slope of the current Line
     * @throws IllegalStateException if the Line doesn't have at least two Points
     */
    public double calculateSlope() throws IllegalStateException {
        if (this.points.size() < 2) {
            throw new IllegalStateException("Count Points at line is " + this.points.size()
                    + ". Unable to calculate slope of line without at least two Points");
        }

        Iterator<Point> iterator = this.points.iterator();

        Point firstPoint = iterator.next();

        double runFirstPoint = firstPoint.getX();
        double riseFirstPoint = firstPoint.getY();

        Point secondPoint = iterator.next();

        double runSecondPoint = secondPoint.getX();
        double riseSecondPoint = secondPoint.getY();

        if (Double.compare(runFirstPoint, runSecondPoint) == 0) {
            this.setVertical(true);

            return 0;
        } else if (Double.compare(riseFirstPoint, riseSecondPoint) == 0) {
            this.setHorizontal(true);

            return 0;
        }

        return (runSecondPoint - runFirstPoint) == 0
                ? 0
                : (riseSecondPoint - riseFirstPoint) / (runSecondPoint - runFirstPoint);
    }

    /**
     * @return double value of Y-interception of Line
     * @throws IllegalStateException if the Line doesn't have at least two Points
     */
    public double calculateYInterception() throws IllegalStateException {
        if (this.points.size() < 2) {
            throw new IllegalStateException();
        }

        Iterator<Point> iterator = this.points.iterator();
        Point firstPoint = iterator.next();

        if (this.isVertical()) {
            return firstPoint.getX();
        }

        if (this.isHorizontal()) {
            return firstPoint.getY();
        }

        return firstPoint.getY() - this.getK() * firstPoint.getX();
    }
}
