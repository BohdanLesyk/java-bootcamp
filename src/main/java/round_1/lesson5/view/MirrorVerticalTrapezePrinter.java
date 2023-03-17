package round_1.lesson5.view;

import round_1.lesson5.model.Trapeze;

public class MirrorVerticalTrapezePrinter extends FigurePrinter {
    public static void printMirrorVerticalTrapeze(Trapeze trapeze) {
        int trapezeHeight = trapeze.getHeight(), trapezeWidth = trapeze.getWidth();

        for (int i = 1; i < trapezeWidth; i++) {
            printSpaceLine(trapezeWidth - i, 0);
            printSymbolsLine(i);
            System.out.println();
        }

        for (int i = 0; i < trapezeHeight; i++) {
            printSymbolsLine(trapezeWidth);
            System.out.println();
        }

        for (int i = 1; i < trapezeWidth; i++) {
            printSpaceLine(i, 0);
            printSymbolsLine(trapezeWidth - i);
            System.out.println();
        }
    }

    public static void printMirrorVerticalTrapeze(Trapeze trapeze, char symbol, int shift) {
        int trapezeHeight = trapeze.getHeight(), trapezeWidth = trapeze.getWidth();

        for (int i = 1; i < trapezeWidth; i++) {
            printSpaceLine(trapezeWidth - i, shift);
            printSymbolsLine(i, symbol);
            System.out.println();
        }

        for (int i = 0; i < trapezeHeight; i++) {
            printSpaceLine(0, shift);
            printSymbolsLine(trapezeWidth, symbol);
            System.out.println();
        }

        for (int i = 1; i < trapezeWidth; i++) {
            printSpaceLine(i, shift);
            printSymbolsLine(trapezeWidth - i, symbol);
            System.out.println();
        }
    }
}
