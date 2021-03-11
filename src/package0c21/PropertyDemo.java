package package0c21;

import java.util.stream.IntStream;

public class PropertyDemo {

    public static void main(String[] args) {
        PropertyCollection pc = new PropertyCollection();

        IntStream.range(0, 1000)
                .forEach(i -> {
                    pc.addProperty(new SemiDetachedHouse());
                    pc.addProperty(new TerracedHouse());
                });

        IntStream.range(0, 100)
                .forEach(i -> {
                    pc.addProperty(new DetachedHouse());
                    pc.addProperty(new SemiDetachedBungalow());
                    pc.addProperty(new Flat());
                });

        IntStream.range(0, 20)
                .forEach(i -> {
                    pc.addProperty(new Maisonette());
                    pc.addProperty(new DetachedBungalow());
                    pc.addProperty(new TerracedBungalow());
                });
    }
}
