package round_1.lesson5.view;

import round_1.lesson5.model.IsoscelesTriangle;
import round_1.lesson5.model.Triangle;

public class MirrorIsoscelesTrianglePrinter {
    public static void printMirrorIsoscelesTriangle(IsoscelesTriangle triangle) {
        int triangleHeight = triangle.getHeight();

        TrianglePrinter.printTriangleFromRightBottomCorner(new Triangle(triangleHeight - 1));
        TrianglePrinter.printTriangleFromRightTopCorner(triangle);
    }

    public static void printMirrorIsoscelesTriangle(IsoscelesTriangle triangle, char symbol, int shift) {
        int triangleHeight = triangle.getHeight();

        TrianglePrinter.printTriangleFromRightBottomCorner(new Triangle(triangleHeight - 1), symbol, shift + 1);
        TrianglePrinter.printTriangleFromRightTopCorner(triangle, symbol, shift);
    }
}
