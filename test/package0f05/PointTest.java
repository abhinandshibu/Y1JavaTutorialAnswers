package package0f05;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceToTest() {
        Point p1 = new Point(3, 4, 5);
        Point p2 = new Point(5, 2, 0);
        Assert.assertEquals(p1.distanceTo(p2), 5.74456, 0.0001);
    }

    @Test
    public void magnitude() {
        Point p = new Point(43, 21, -11);
        Assert.assertEquals(Point.magnitude(p), 49.10193, 0.0001);
    }

    @Test
    public void toStringTest() {
        Point p = new Point(12343, -192, 0);
        Assert.assertEquals(p.toString(), "(12343, -192, 0)");
    }
}
