package round_3.lesson3;

import java.io.*;
import java.util.Objects;

public class Point implements Serializable {
    private String name;
    private int x;
    private int y;

    public Point() { }

    public Point(String name) {
        this.name = name;
    }

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    @Serial
    private static final long serialVersionUID = -2_708_910_067_279_288_229L;

    public boolean isLyingOnLine(Line line) throws IllegalStateException {
        if (line.getPoints().size() < 2) {
            throw new IllegalStateException("Count Points at line is " + line.getPoints().size()
                    + ". Unable to calculate if this point is lies on the line. Line should consist of at least two Points");
        }

        return this.getY() == line.getK() * this.getX() + line.getB();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;

        return Objects.equals(this.getX(), point.getX())
                && Objects.equals(this.getY(), point.getY())
                && Objects.equals(this.getName(), point.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getX(), this.getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + this.getName() + '\'' +
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
