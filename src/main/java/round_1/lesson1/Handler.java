package round_1.lesson1;

/**
 * Draw rectangles points here
 * 10
 * 9         *
 * 8
 * 7                 *
 * 6
 * 5
 * 4
 * 3         *
 * 2
 * 1 *
 * 0 1 2 3 4 5 6 7 8 9 10
 */
public class Handler {
    public static void main(String[] args) {
        checkPointsCrossing(1, 1, 9, 5, 1, 6, 9, 9);// Rectangles shouldn't cross
        checkPointsCrossing(1, 1, 5, 5, 6, 1, 10, 7);// Rectangles shouldn't cross
        checkPointsCrossing(6, 0, 10, 7, 0, 0, 5, 7);// Rectangles shouldn't cross
        checkPointsCrossing(1, 6, 10, 10, 0, 5, 9, 0);// Rectangles shouldn't cross

        System.out.println("---------------------------------------------------");

        checkPointsCrossing(0, 0, 5, 5, 5, 5, 9, 9);// Crossing in point R1 right top == R2 left bottom
        checkPointsCrossing(0, 5, 5, 9, 5, 0, 9, 5);// Crossing in point R1 right bottom == R2 left top
        checkPointsCrossing(5, 5, 9, 9, 0, 0, 5, 5);// Crossing in point R1 left bottom == R2 right top
        checkPointsCrossing(5, 0, 9, 5, 0, 5, 5, 9);// Crossing in point R1 left top == R2 right bottom

        System.out.println("---------------------------------------------------");

        checkPointsCrossing(0, 2, 6, 6, 6, 5, 9, 9);// Crossing in vertical line R1 right vertical line == R2 left vertical line
        checkPointsCrossing(0, 2, 6, 6, 6, 1, 9, 9);// Crossing in vertical line R1 right vertical line == R2 left vertical line
        checkPointsCrossing(0, 2, 6, 6, 6, 1, 9, 4);// Crossing in vertical line R1 right vertical line == R2 left vertical line
        checkPointsCrossing(0, 2, 6, 6, 6, 1, 9, 9);// Crossing in vertical line R1 right vertical line == R2 left vertical line
        checkPointsCrossing(5, 1, 9, 5, 0, 4, 5, 9);// Crossing in vertical line R2 right vertical line == R1 left vertical line
        checkPointsCrossing(5, 3, 9, 7, 1, 1, 5, 9);// Crossing in vertical line R2 right vertical line == R1 left vertical line
        checkPointsCrossing(5, 4, 9, 9, 0, 0, 5, 5);// Crossing in vertical line R2 right vertical line == R1 left vertical line
        checkPointsCrossing(5, 3, 9, 7, 0, 0, 5, 9);// Crossing in vertical line R2 right vertical line == R1 left vertical line

        System.out.println("---------------------------------------------------");

        checkPointsCrossing(0, 0, 7, 5, 4, 5, 9, 9);// Crossing in horizontal line R1 top horizontal line == R2 bottom horizontal line
        checkPointsCrossing(3, 0, 7, 5, 0, 5, 9, 9);// Crossing in horizontal line R1 top horizontal line == R2 bottom horizontal line
        checkPointsCrossing(3, 0, 9, 5, 0, 5, 4, 9);// Crossing in horizontal line R1 top horizontal line == R2 bottom horizontal line
        checkPointsCrossing(3, 0, 7, 5, 2, 5, 8, 9);// Crossing in horizontal line R1 top horizontal line == R2 bottom horizontal line
        checkPointsCrossing(0, 5, 7, 9, 6, 0, 9, 5);// Crossing in horizontal line R2 top horizontal line == R1 bottom horizontal line
        checkPointsCrossing(3, 5, 7, 9, 2, 0, 8, 5);// Crossing in horizontal line R2 top horizontal line == R1 bottom horizontal line
        checkPointsCrossing(5, 5, 9, 9, 0, 0, 6, 5);// Crossing in horizontal line R2 top horizontal line == R1 bottom horizontal line
        checkPointsCrossing(3, 5, 7, 9, 2, 0, 8, 5);// Crossing in horizontal line R2 top horizontal line == R1 bottom horizontal line

        System.out.println("---------------------------------------------------");

        checkPointsCrossing(0, 5, 7, 9, 3, 0, 9, 8);
        checkPointsCrossing(3, 5, 9, 9, 4, 0, 7, 7);
        checkPointsCrossing(5, 5, 9, 9, 0, 0, 7, 7);
        checkPointsCrossing(6, 2, 9, 9, 3, 3, 8, 7);
        checkPointsCrossing(0, 5, 7, 9, 5, 0, 9, 7);
        checkPointsCrossing(3, 5, 7, 9, 2, 0, 9, 7);
        checkPointsCrossing(4, 4, 9, 9, 0, 0, 7, 7);
        checkPointsCrossing(3, 3, 7, 7, 0, 0, 5, 9);
        checkPointsCrossing(3, 3, 7, 7, 3, 3, 7, 7);

        System.out.println("---------------------------------------------------");
    }

    private static void checkPointsCrossing(int ax1, int ay1, int bx1, int by1, int ax2, int ay2, int bx2, int by2) {
        if (bx1 < ax2                           // R1 right vertical line < R2 left vertical line
                | by1 < ay2                     // R1 top horizontal line < R2 bottom horizontal line
                | bx2 < ax1                     // R2 right vertical line < R1 left vertical line
                | by2 < ay1) {                  // R2 top horizontal line < R1 bottom horizontal line
            System.out.println("Rectangles are not crossing");
        } else if (bx1 == ax2 & by1 == ay2      // R1 right top corner == R2 left bottom corner
                | bx1 == ax2 & ay1 == by2       // R1 right bottom corner == R2 left top corner
                | ax1 == bx2 & ay1 == by2       // R1 left bottom corner == R2 right top corner
                | ax1 == bx2 & by1 == ay2) {    // R1 left top corner == R2 right bottom corner
            System.out.println("Crossing is point");
        } else if ((bx1 == ax2 & (ay2 < by1 | ay1 < by2))   // R1 right vertical line cross R2 left vertical line
                | (ax1 == bx2 & (ay2 < by1 | ay1 < by2))    // R2 right vertical line cross R1 left vertical line
        ) {
            System.out.println("Crossing is vertical line");
        } else if ((ay1 == by2 & (ax2 > bx1 | bx2 > ax1))   // R1 top horizontal line cross R2 bottom horizontal line
                | (by1 == ay2 & (ax2 > bx1 | bx2 > ax1))    // R2 top horizontal line cross R1 bottom horizontal line
        ) {
            System.out.println("Crossing is horizontal line");
        } else {
            System.out.println("Crossing is rectangle");
        }
    }
}
