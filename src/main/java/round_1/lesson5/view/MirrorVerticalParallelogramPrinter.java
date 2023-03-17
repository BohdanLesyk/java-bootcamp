package round_1.lesson5.view;

import round_1.lesson5.model.Rectangle;
import round_1.lesson5.model.Triangle;

public class MirrorVerticalParallelogramPrinter {
    public static void printVerticalParallelogram(Triangle triangle) {
        int heightTriangle = triangle.getHeight();

        TrianglePrinter.printTriangleFromRightBottomCorner(new Triangle(heightTriangle - 1));
        RectanglePrinter.printRectangle(new Rectangle(heightTriangle - 1, heightTriangle));
        TrianglePrinter.printTriangleFromLeftTopCorner(triangle);
    }

    public static void printVerticalParallelogram(Triangle triangle, char symbol, int shift) {
        int heightTriangle = triangle.getHeight();

        TrianglePrinter.printTriangleFromRightBottomCorner(new Triangle(heightTriangle - 1), symbol, shift + 1);
        RectanglePrinter.printRectangle(new Rectangle(heightTriangle - 1, heightTriangle), symbol, shift);
        TrianglePrinter.printTriangleFromLeftTopCorner(triangle, symbol, shift);
    }
}
