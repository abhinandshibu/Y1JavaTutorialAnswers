package package0f05;

public class Point {

    private final int x;
    private final int y;
    private final int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(
                Math.pow(x - p.getX(), 2) +
                Math.pow(y - p.getY(), 2) +
                Math.pow(z - p.getZ(), 2)
        );
    }

    public static Point getOrigin() {
        return new Point(0, 0, 0);
    }

    public static double magnitude(Point p) {
        return Math.sqrt(
                Math.pow(p.getX(), 2) +
                Math.pow(p.getY(), 2) +
                Math.pow(p.getZ(), 2)
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
