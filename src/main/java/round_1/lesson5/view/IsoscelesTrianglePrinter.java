package round_1.lesson5.view;

import round_1.lesson5.model.IsoscelesTriangle;
import round_1.lesson5.model.Triangle;

public class IsoscelesTrianglePrinter extends FigurePrinter {
    public static void printIsoscelesTriangle(IsoscelesTriangle triangle) {
        int triangleHeight = triangle.getHeight();

        TrianglePrinter.printTriangleFromLeftBottomCorner(triangle);
        TrianglePrinter.printTriangleFromLeftTopCorner(new Triangle(triangleHeight - 1));
    }

    public static void printIsoscelesTriangle(IsoscelesTriangle triangle, char symbol, int shift) {
        int triangleHeight = triangle.getHeight();

        TrianglePrinter.printTriangleFromLeftBottomCorner(triangle, symbol, shift);
        TrianglePrinter.printTriangleFromLeftTopCorner(new Triangle(triangleHeight - 1), symbol, shift);
    }
}
