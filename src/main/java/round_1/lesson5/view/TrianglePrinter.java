package round_1.lesson5.view;

import round_1.lesson5.model.Triangle;

public class TrianglePrinter extends FigurePrinter {
    public static void printTriangleFromLeftBottomCorner(Triangle triangle) {
        for (int i = 1; i <= triangle.getHeight(); i++) {
            printSymbolsLine(i);
            System.out.println();
        }
    }

    public static void printTriangleFromLeftBottomCorner(Triangle triangle, char displaySymbols, int shift) {
        for (int i = 1; i <= triangle.getHeight(); i++) {
            printSpaceLine(0, shift);
            printSymbolsLine(i, displaySymbols);
            System.out.println();
        }
    }

    public static void printTriangleFromLeftTopCorner(Triangle triangle) {
        for (int i = triangle.getHeight(); i > 0; i--) {
            printSymbolsLine(i);
            System.out.println();
        }
    }

    public static void printTriangleFromLeftTopCorner(Triangle triangle, char displaySymbols, int shift) {
        for (int i = triangle.getHeight(); i > 0; i--) {
            printSpaceLine(0, shift);
            printSymbolsLine(i, displaySymbols);
            System.out.println();
        }
    }

    public static void printTriangleFromRightTopCorner(Triangle triangle) {
        for (int i = 0; i < triangle.getHeight(); i++) {
            printSpaceLine(i, 0);
            printSymbolsLine(triangle.getHeight() - i);
            System.out.println();
        }
    }

    public static void printTriangleFromRightTopCorner(Triangle triangle, char displaySymbols, int shift) {
        for (int i = 0; i < triangle.getHeight(); i++) {
            printSpaceLine(i, shift);
            printSymbolsLine(triangle.getHeight() - i, displaySymbols);
            System.out.println();
        }
    }

    public static void printTriangleFromRightBottomCorner(Triangle triangle) {
        for (int i = 0; i < triangle.getHeight(); i++) {
            printSpaceLine(triangle.getHeight() - i, 0);
            printSymbolsLine(i + 1);
            System.out.println();
        }
    }

    public static void printTriangleFromRightBottomCorner(Triangle triangle, char displaySymbols, int shift) {
        for (int i = 0; i < triangle.getHeight(); i++) {
            printSpaceLine(triangle.getHeight() - i - 1, shift);
            printSymbolsLine(i + 1, displaySymbols);
            System.out.println();
        }
    }
}
