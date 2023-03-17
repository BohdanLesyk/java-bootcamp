package round_1.lesson5.view;

import round_1.lesson5.model.Trapeze;

public class HorizontalTrapezePrinter extends FigurePrinter {
    public static void printHorizontalTrapeze(Trapeze trapeze) {
        int trapezeHeight = trapeze.getHeight(), trapezeWidth = trapeze.getWidth();

        for (int i = 0; i < trapezeHeight; i++) {
            printSpaceLine(trapezeHeight - i - 1, 0);
            printSymbolsLine(trapezeWidth + i * 2);
            System.out.println();
        }
    }

    public static void printHorizontalTrapeze(Trapeze trapeze, char symbol, int shift) {
        int trapezeHeight = trapeze.getHeight(), trapezeWidth = trapeze.getWidth();

        for (int i = 0; i < trapezeHeight; i++) {
            printSpaceLine(trapezeHeight - i - 1, shift);
            printSymbolsLine(trapezeWidth + i * 2, symbol);
            System.out.println();
        }
    }
}
