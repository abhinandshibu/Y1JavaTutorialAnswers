package package5235;

public class Colour {

    private final int r;
    private final int g;
    private final int b;

    public Colour(int r, int g, int b) throws Exception {
        if (!(inRange(r) && inRange(g) && inRange(b))) {
            throw new ColourRangeOutOfBoundsException();
        }

        this.r = r;
        this.g = g;
        this.b = b;
    }

    private boolean inRange(int x) {
        return x >= 0 && x <= 255;
    }

    @Override
    public String toString() {
        return "(" + r + ", " + g + ", " + b + ")";
    }
}
