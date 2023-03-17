package round_1.lesson6;

import round_1.lesson6.controller.RectangleController;
import round_1.lesson6.model.Point;
import round_1.lesson6.model.Rectangle;
import round_1.lesson6.view.RectangleView;

import java.util.List;

public class Handler {
    public static void main(String[] args) {
        List<Rectangle> rectangles = List.of(
                new Rectangle(new Point(1, 2), new Point(9, 7)),
                new Rectangle(new Point(4, 5), new Point(9, 9)),
                new Rectangle(new Point(1, 1), new Point(4, 5)),
                new Rectangle(new Point(4, 5), new Point(9, 9)),
                new Rectangle(new Point(1, 1), new Point(4, 5)),
                new Rectangle(new Point(4, 1), new Point(8, 9)),
                new Rectangle(new Point(2, 5), new Point(8, 9))
        );

        String typeOfCrossingTwoRectangles;

        for (int i = 0; i < rectangles.size() - 1; i++) {
            for (int j = i + 1; j < rectangles.size(); j++) {
                typeOfCrossingTwoRectangles = RectangleController.getTypeOfCrossingTwoRectangles(rectangles.get(i), rectangles.get(j));
                RectangleView.printTypeOfCrossing(rectangles.get(i) + " with " + rectangles.get(j) + ":  " + typeOfCrossingTwoRectangles);
            }

            System.out.println("---------------------");
        }
    }
}
