package packagec2b8;

public class Rectangle {

    private final Point topLeft;
    private final int width;
    private final int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area() {
        return width * height;
    }

    private Point getBottomRight() {
        return new Point(
                topLeft.getCoordX() + width,
                topLeft.getCoordY() + height
        );
    }

    public boolean contains(Rectangle other) {
        return
                this.topLeft.getCoordX() <= other.getTopLeft().getCoordX()
                        && this.topLeft.getCoordY() <= other.getTopLeft().getCoordY()
                        && this.getBottomRight().getCoordX() >= other.getBottomRight().getCoordX()
                        && this.getBottomRight().getCoordY() >= other.getBottomRight().getCoordY();
    }

    @Override
    public String toString() {
        return "(top-left = " + topLeft + ", width = " + width
                + ", height = " + height + ")";
    }

}
