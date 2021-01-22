package package7ec8;

import org.junit.Assert;
import org.junit.Test;

public class FighterTest {

    @Test
    public void toStringTests(){
        Fighter f = new Fighter("john", "elk lord");

        // don't know how to ignore the skill and stamina values (since they are random)
        // it would be good to check whether they are in the expected range as well
        Assert.assertEquals("Fighter{name='john', type='elk lord', skill=8, stamina=20}",
                f.toString());
    }

}
