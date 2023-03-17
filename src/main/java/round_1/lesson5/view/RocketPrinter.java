package round_1.lesson5.view;

import round_1.lesson5.model.HorizontalTriangle;
import round_1.lesson5.model.Rectangle;
import round_1.lesson5.model.Trapeze;

public class RocketPrinter extends FigurePrinter {
    public static void printRocket(HorizontalTriangle triangle, Trapeze middleTrapeze, Trapeze bottomTrapeze) {
        int shiftTopElems = bottomTrapeze.getWidth() - 3;
        int shiftMiddleTrapeze = bottomTrapeze.getWidth() - middleTrapeze.getHeight() - 2;

        HorizontalTrianglePrinter.printHorizontalTriangle(triangle, '.', shiftTopElems);
        RectanglePrinter.printRectangle(new Rectangle(triangle.getHeight() / 2 + 1, findWidth(triangle.getHeight())), '.', shiftTopElems);
        HorizontalTrapezePrinter.printHorizontalTrapeze(middleTrapeze, '.', shiftMiddleTrapeze);
        RectanglePrinter.printRectangle(new Rectangle(middleTrapeze.getWidth() / 2 + 1, findWidth(triangle.getHeight())), '.', shiftTopElems);
        HorizontalTrapezePrinter.printHorizontalTrapeze(bottomTrapeze);
    }

    private static int findWidth(int length) {
        int result = 1;

        for (int i = 1; i < length; i++) {
            result += 2;
        }

        return result;
    }
}
