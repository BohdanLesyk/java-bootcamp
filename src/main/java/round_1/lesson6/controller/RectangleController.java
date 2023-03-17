package round_1.lesson6.controller;

import round_1.lesson6.model.Rectangle;

public class RectangleController {
    public static String getTypeOfCrossingTwoRectangles(Rectangle firstRectangle, Rectangle secondRectangle) {
        if ( firstRectangle.getA().getX() > secondRectangle.getB().getX()
                | firstRectangle.getA().getY() > secondRectangle.getB().getY()
                | firstRectangle.getB().getX() < secondRectangle.getA().getX()
                | firstRectangle.getB().getY() < secondRectangle.getA().getY()) {
            return "Rectangles are not crossing";
        } else if (firstRectangle.getB().getX() == secondRectangle.getA().getX()
                & firstRectangle.getB().getY() == secondRectangle.getA().getY()
                | firstRectangle.getB().getX() == secondRectangle.getA().getX()
                & firstRectangle.getA().getY() == secondRectangle.getB().getY()
                | firstRectangle.getA().getX() == secondRectangle.getB().getX()
                & firstRectangle.getA().getY() == secondRectangle.getB().getY()
                | firstRectangle.getA().getX() == secondRectangle.getB().getX()
                & firstRectangle.getB().getY() == secondRectangle.getA().getY()) {
            return "Crossing is point";
        } else if (secondRectangle.getA().getX() == firstRectangle.getB().getX()
                | firstRectangle.getA().getX() == secondRectangle.getB().getX()) {
            return "Crossing is vertical line";
        } else if (firstRectangle.getA().getY() == secondRectangle.getB().getY()
                | firstRectangle.getB().getY() == secondRectangle.getA().getY()) {
            return "Crossing is horizontal line";
        } else {
            return "Crossing is rectangle";
        }
    }
}
