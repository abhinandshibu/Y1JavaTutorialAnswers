package package710c;

import java.util.Objects;

public class ColouredPoint extends Point {

    private final Colour colour;

    public ColouredPoint(int x, int y, int z, Colour colour) {
        super(x, y, z);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Coords: " + super.toString() + "\n Colour: " + colour.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColouredPoint)) return false;
        if (!super.equals(o)) return false;
        ColouredPoint that = (ColouredPoint) o;
        return Objects.equals(colour, that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }
}
