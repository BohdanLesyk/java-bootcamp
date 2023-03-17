package round_1.lesson5.view;

import round_1.lesson5.model.HorizontalTriangle;

public class HorizontalTrianglePrinter extends FigurePrinter {
    public static void printHorizontalTriangle(HorizontalTriangle horizontalTriangle) {
        int heightTriangle = horizontalTriangle.getHeight();

        for (int i = 0; i < heightTriangle; i++) {
            printSpaceLine(heightTriangle - i, 0);
            printSymbolsLine(i + 1);
            printSymbolsLine(i);
            System.out.println();
        }
    }

    public static void printHorizontalTriangle(HorizontalTriangle horizontalTriangle, char symbol, int shift) {
        int heightTriangle = horizontalTriangle.getHeight();

        for (int i = 0; i < heightTriangle; i++) {
            printSpaceLine(heightTriangle - i - 1, shift);
            printSymbolsLine(i + 1, symbol);
            printSymbolsLine(i, symbol);
            System.out.println();
        }
    }
}
