package round_1.lesson5.view;

import round_1.lesson5.model.Rectangle;

public class RectanglePrinter extends FigurePrinter {
    public static void printRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            printSymbolsLine(rectangle.getWidth());
            System.out.println();
        }
    }

    public static void printRectangle(Rectangle rectangle, char displaySymbols, int shift) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            printSpaceLine(0, shift);
            printSymbolsLine(rectangle.getWidth(), displaySymbols);
            System.out.println();
        }
    }
}
