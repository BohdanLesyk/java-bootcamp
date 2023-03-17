package round_1.lesson5.view;

import round_1.lesson5.model.Triangle;

public class VerticalDoubleTrianglePrinter {
    public static void printVerticalDoubleTriangle(Triangle triangle) {
        int heightTriangle = triangle.getHeight();

        TrianglePrinter.printTriangleFromLeftBottomCorner(new Triangle(heightTriangle - 1));
        TrianglePrinter.printTriangleFromRightTopCorner(triangle);
    }

    public static void printVerticalDoubleTriangle(Triangle triangle, char symbol, int shift) {
        int heightTriangle = triangle.getHeight();

        TrianglePrinter.printTriangleFromLeftBottomCorner(new Triangle(heightTriangle - 1), symbol, shift);
        TrianglePrinter.printTriangleFromRightTopCorner(triangle, symbol, shift);
    }
}
