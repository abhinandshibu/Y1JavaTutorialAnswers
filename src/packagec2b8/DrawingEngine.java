package packagec2b8;

import java.util.HashSet;
import java.util.Set;

public class DrawingEngine {

    private final Set<Rectangle> rectangles;

    public DrawingEngine() {
        rectangles = new HashSet<>();
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public boolean contains(Rectangle r1, Rectangle r2) {
        return r1.contains(r2);
    }

    public int maxArea() {
        int result = 0;
        for (Rectangle r : rectangles) {
            if (r.area() > result) {
                result = r.area();
            }
        }
        return result;
    }

    public String toString() {

        final StringBuilder result = new StringBuilder("Drawing engine is looking after these rectangles:");
        for (Rectangle r : rectangles) {
            result.append("\n   ").append(r);
        }
        return result.toString();

    }

    // is used in drawing engine demo, so hence kept, though removed usage from
    // drawing engine toString()
    public String rectangleToString(Rectangle rectangle) {
        return rectangle.toString();
    }

}
