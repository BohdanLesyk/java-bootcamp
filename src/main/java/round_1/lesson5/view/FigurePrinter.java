package round_1.lesson5.view;

public class FigurePrinter {
    protected static void printSymbolsLine(int lineLength) {
        if (lineLength < 1) {
            return;
        }

        for (int i = 0; i < lineLength; i++) {
            System.out.print('.');
        }
    }

    protected static void printSymbolsLine(int lineLength, char symbol) {
        if (lineLength < 1) {
            return;
        }

        for (int i = 0; i < lineLength; i++) {
            System.out.print(symbol);
        }
    }

    protected static void printSpaceLine(int lineLength, int shift) {
        for (int i = 0; i < lineLength + shift; i++) {
            System.out.print(' ');
        }
    }
}
