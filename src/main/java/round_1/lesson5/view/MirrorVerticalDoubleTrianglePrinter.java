package round_1.lesson5.view;

import round_1.lesson5.model.Triangle;

public class MirrorVerticalDoubleTrianglePrinter {
    public static void printMirrorVerticalDoubleTriangle(Triangle triangle) {
        int triangleHeight = triangle.getHeight();

        TrianglePrinter.printTriangleFromRightBottomCorner(new Triangle(triangleHeight - 1));
        TrianglePrinter.printTriangleFromLeftTopCorner(triangle);
    }

    public static void printMirrorVerticalDoubleTriangle(Triangle triangle, char symbol, int shift) {
        int triangleHeight = triangle.getHeight();

        TrianglePrinter.printTriangleFromRightBottomCorner(new Triangle(triangleHeight - 1), symbol, shift + 1);
        TrianglePrinter.printTriangleFromLeftTopCorner(triangle, symbol, shift);
    }
}
