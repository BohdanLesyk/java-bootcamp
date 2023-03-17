package round_1.lesson5.view;

import round_1.lesson5.model.Trapeze;

public class VerticalTrapezePrinter extends FigurePrinter {
    public static void printVerticalTrapeze(Trapeze trapeze) {
        int trapezeHeight = trapeze.getHeight(), trapezeWidth = trapeze.getWidth();

        for (int i = 1; i < trapezeWidth; i++) {
            printSymbolsLine(i);
            System.out.println();
        }

        for (int i = 0; i < trapezeHeight; i++) {
            printSymbolsLine(trapezeWidth);
            System.out.println();
        }

        for (int i = 1; i < trapezeWidth; i++) {
            printSymbolsLine(trapezeWidth - i);
            System.out.println();
        }
    }

    public static void printVerticalTrapeze(Trapeze trapeze, char symbol, int shift) {
        int trapezeHeight = trapeze.getHeight(), trapezeWidth = trapeze.getWidth();

        for (int i = 1; i < trapezeWidth; i++) {
            printSpaceLine(0, shift);
            printSymbolsLine(i, symbol);
            System.out.println();
        }

        for (int i = 0; i < trapezeHeight; i++) {
            printSpaceLine(0, shift);
            printSymbolsLine(trapezeWidth, symbol);
            System.out.println();
        }

        for (int i = 1; i < trapezeWidth; i++) {
            printSpaceLine(0, shift);
            printSymbolsLine(trapezeWidth - i, symbol);
            System.out.println();
        }
    }
}
