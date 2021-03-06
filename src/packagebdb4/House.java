package packagebdb4;

public class House {

    private Rectangle floorSize;

    public House(Rectangle floorSize) {
        this.floorSize = floorSize;
    }

    public Rectangle getFloorSize() {
        // return a clone
        return new Rectangle(floorSize.getWidth(), floorSize.getHeight());
    }

    public void setFloorSize(Rectangle floorSize) {
        this.floorSize = floorSize;
    }

    public int getFloorArea() {
        return floorSize.getArea();
    }

}
