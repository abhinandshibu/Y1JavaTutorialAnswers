package package0c21;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class PropertyCollectionTest {

    private PropertyCollection populateCollection() {
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

        return pc;
    }

    // "bungalows and maisonettes are regarded as being houses and flats"
    // this contradicts with the initial work through of the question so a new solution
    // needs to be made from the current altering the inheritance hierarchy.
    @Test
    public void getHousesTest() {
        PropertyCollection pc = populateCollection();
        Assert.assertEquals(2240, pc.getHouses().size());
    }

    @Test
    public void getBungalowsTest() {
        PropertyCollection pc = populateCollection();
        Assert.assertEquals(140, pc.getBungalows().size());
    }

    @Test
    public void getFlatsTest() {
        PropertyCollection pc = populateCollection();
        Assert.assertEquals(120, pc.getFlats().size());
    }

    @Test
    public void getMaisonettesTest() {
        PropertyCollection pc = populateCollection();
        Assert.assertEquals(20, pc.getMaisonettes().size());
    }

    @Test
    public void getTerracedHousesTest() {
        PropertyCollection pc = populateCollection();
        Assert.assertEquals(1020, pc.getTerracedHouses().size());
    }
}
