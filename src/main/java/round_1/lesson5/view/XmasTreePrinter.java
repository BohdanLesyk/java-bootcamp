package round_1.lesson5.view;

import round_1.lesson5.model.Triangle;

public class XmasTreePrinter extends FigurePrinter {
    public static void printXmasTree(Triangle triangleTop, Triangle triangleMiddle, Triangle triangleBottom) {
        for (int row = 1; row <= triangleTop.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - row, 0);
            printSymbolsLine(row);
            printSymbolsLine(row - 1);
            System.out.println();
        }

        for (int row = 1; row <= triangleMiddle.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - row, 0);
            printSymbolsLine(row);
            printSymbolsLine(row - 1);
            System.out.println();
        }

        for (int row = 1; row <= triangleBottom.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - row, 0);
            printSymbolsLine(row);
            printSymbolsLine(row - 1);
            System.out.println();
        }

        for (int row = 0; row < triangleTop.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - triangleTop.getHeight(), 0);
            printSymbolsLine(triangleTop.getHeight());
            printSymbolsLine(triangleTop.getHeight() - 1);
            System.out.println();
        }
    }

    public static void printXmasTree(Triangle triangleTop, Triangle triangleMiddle, Triangle triangleBottom, char symbol, int shift) {
        for (int row = 1; row <= triangleTop.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - row, shift);
            printSymbolsLine(row, symbol);
            printSymbolsLine(row - 1, symbol);
            System.out.println();
        }

        for (int row = 1; row <= triangleMiddle.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - row, shift);
            printSymbolsLine(row, symbol);
            printSymbolsLine(row - 1, symbol);
            System.out.println();
        }

        for (int row = 1; row <= triangleBottom.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - row, shift);
            printSymbolsLine(row, symbol);
            printSymbolsLine(row - 1, symbol);
            System.out.println();
        }

        for (int row = 0; row < triangleTop.getHeight(); row++) {
            printSpaceLine(triangleBottom.getHeight() - triangleTop.getHeight(), shift);
            printSymbolsLine(triangleTop.getHeight(), symbol);
            printSymbolsLine(triangleTop.getHeight() - 1, symbol);
            System.out.println();
        }
    }
}
