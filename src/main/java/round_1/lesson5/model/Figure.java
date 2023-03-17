package round_1.lesson5.model;

public class Figure {
    private int height;
    private int width;

    public Figure(int height) {
        this.height = height;
    }

    public Figure(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
