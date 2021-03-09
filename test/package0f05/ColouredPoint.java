package package0f05;

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

}
