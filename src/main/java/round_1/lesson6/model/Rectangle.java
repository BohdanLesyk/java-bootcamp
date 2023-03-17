package round_1.lesson6.model;

public class Rectangle {
    private final Point A;
    private final Point B;

    public Rectangle(Point a, Point b) {
        A = a;
        B = b;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }
}
