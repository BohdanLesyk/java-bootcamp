package round_1.lesson2;

public class Handler {
    private static final int COUNT = 6;

    public static void main(String[] args) {
        task2();
        task3();
        task4();
        task5();
    }

    private static void task2() {
        for (int row = 1; row < COUNT + 1; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print('.');
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = 0; row < COUNT; row++) {
            for (int col = row; col < COUNT; col++) {
                System.out.print('.');
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = 0; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) {
                    System.out.print(' ');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = COUNT -1; row > -1; row--) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) { System.out.print(' '); }
                else { System.out.print('.'); }
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = 0; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                System.out.print("  .");
            }
            System.out.println();
        }

        System.out.println("************************************");
    }

    private static void task3() {
        for (int row = 1; row < COUNT + 1; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }
        for (int row = 1; row < COUNT; row++) {
            for (int col = row; col < COUNT; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = 1; row < COUNT + 1; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }
        for (int row = 1; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = COUNT -1; row > -1; row--) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) { System.out.print("  "); }
                else { System.out.print(" ."); }
            }
            System.out.println();
        }
        for (int row = 1; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = COUNT -1; row > -1; row--) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) { System.out.print("  "); }
                else { System.out.print(" ."); }
            }
            System.out.println();
        }
        for (int row = 1; row < COUNT; row++) {
            for (int col = row; col < COUNT; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = COUNT -1; row > -1; row--) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) { System.out.print("  "); }
                else { System.out.print(" ."); }
            }
            System.out.println();
        }
        for (int row = 2; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }
        for (int row = 1; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }

        System.out.println("************************************");

        for (int row = COUNT -1; row > -1; row--) {
            for (int col = 0; col < COUNT; col++) {
                if (col < row) { System.out.print("  "); }
                else { System.out.print(" ."); }
            }
            System.out.println();
        }
        for (int row = 2; row < COUNT; row++) {
            for (int col = 0; col < COUNT; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }
        for (int row = 1; row < COUNT; row++) {
            for (int col = row; col < COUNT; col++) {
                System.out.print(" .");
            }
            System.out.println();
        }

        System.out.println("************************************");
    }

    private static void task4() {
        for (int row = 1; row < COUNT + 1; row++) {
            for (int col = COUNT - row; col > 0; col--) {
                System.out.print(' ');
            }

            for (int col = 0; col < row; col++) {
                System.out.print(" .");
            }

            System.out.println();
        }

        System.out.println("************************************");

        for (int row = 0; row < COUNT; row++) {
            for (int col = 0; col < COUNT * 6 - 1; col++) {
                if (col > COUNT - row & col <= COUNT * 2 + row) {
                    System.out.print(" .");
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }

        System.out.println("************************************");
    }

    private static void task5() {
        int heightOfTree = 3, size = 7, shift = 10;
        char symbol = '*';

        for (int floor = 0; floor < heightOfTree; floor++) {
            for (int row = 1; row < size + 1; row++) {
                for (int col = size - row + shift; col > 0; col--) {
                    System.out.print(' ');
                }

                for (int col = 0; col < row; col++) {
                    System.out.print(" " + symbol);
                }

                System.out.println();
            }
        }
    }
}
