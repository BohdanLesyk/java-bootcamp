package round_1.lesson5;

import round_1.lesson5.model.*;
import round_1.lesson5.view.*;

public class Handler {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5);
        TrianglePrinter.printTriangleFromLeftBottomCorner(triangle);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromLeftBottomCorner(triangle, '&', 3);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromLeftTopCorner(triangle);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromLeftTopCorner(triangle, '#', 3);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromRightTopCorner(triangle);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromRightTopCorner(triangle, ':', 3);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromRightBottomCorner(triangle);
        System.out.println("**************************");
        TrianglePrinter.printTriangleFromRightBottomCorner(triangle, '*', 0);
        System.out.println("**************************");

        Rectangle rectangle = new Rectangle(3, 10);
        RectanglePrinter.printRectangle(rectangle);
        System.out.println("**************************");
        RectanglePrinter.printRectangle(rectangle, '@', 3);
        System.out.println("**************************");

        HorizontalTriangle horizontalTriangle = new HorizontalTriangle(6);
        HorizontalTrianglePrinter.printHorizontalTriangle(horizontalTriangle);
        System.out.println("**************************");
        HorizontalTrianglePrinter.printHorizontalTriangle(horizontalTriangle, '#', 3);
        System.out.println("**************************");

        Trapeze trapeze = new Trapeze(4, 7);
        HorizontalTrapezePrinter.printHorizontalTrapeze(trapeze);
        System.out.println("**************************");
        HorizontalTrapezePrinter.printHorizontalTrapeze(trapeze, '#', 3);
        System.out.println("**************************");

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(5);
        IsoscelesTrianglePrinter.printIsoscelesTriangle(isoscelesTriangle);
        System.out.println("**************************");
        IsoscelesTrianglePrinter.printIsoscelesTriangle(isoscelesTriangle, '@', 3);
        System.out.println("**************************");

        MirrorIsoscelesTrianglePrinter.printMirrorIsoscelesTriangle(isoscelesTriangle);
        System.out.println("**************************");
        MirrorIsoscelesTrianglePrinter.printMirrorIsoscelesTriangle(isoscelesTriangle, '#', 3);
        System.out.println("**************************");

        VerticalDoubleTrianglePrinter.printVerticalDoubleTriangle(triangle);
        System.out.println("**************************");
        VerticalDoubleTrianglePrinter.printVerticalDoubleTriangle(triangle, '$', 3);
        System.out.println("**************************");

        MirrorVerticalDoubleTrianglePrinter.printMirrorVerticalDoubleTriangle(triangle);
        System.out.println("**************************");
        MirrorVerticalDoubleTrianglePrinter.printMirrorVerticalDoubleTriangle(triangle, '$', 3);
        System.out.println("**************************");

        VerticalTrapezePrinter.printVerticalTrapeze(trapeze);
        System.out.println("**************************");
        VerticalTrapezePrinter.printVerticalTrapeze(trapeze, '#', 3);
        System.out.println("**************************");

        MirrorVerticalTrapezePrinter.printMirrorVerticalTrapeze(trapeze);
        System.out.println("**************************");
        MirrorVerticalTrapezePrinter.printMirrorVerticalTrapeze(trapeze, '#', 3);
        System.out.println("**************************");

        VerticalParallelogramPrinter.printVerticalParallelogram(triangle);
        System.out.println("**************************");
        VerticalParallelogramPrinter.printVerticalParallelogram(triangle, '#', 3);
        System.out.println("**************************");

        MirrorVerticalParallelogramPrinter.printVerticalParallelogram(triangle);
        System.out.println("**************************");
        MirrorVerticalParallelogramPrinter.printVerticalParallelogram(triangle, '#', 3);
        System.out.println("**************************");

        XmasTreePrinter.printXmasTree(
                new Triangle(3),
                new Triangle(5),
                new Triangle(7)
        );
        System.out.println("**************************");
        XmasTreePrinter.printXmasTree(
                new Triangle(9),
                new Triangle(11),
                new Triangle(13),
                '!',
                7
        );

        RocketPrinter.printRocket(
                new HorizontalTriangle(5),
                new Trapeze(4, 9),
                new Trapeze(7, 9)
        );
    }
}
