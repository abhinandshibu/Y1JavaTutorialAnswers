package package68e6;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleTest {

    @Test
    public void testConcatenate() {
        final List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        final List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        Assert.assertEquals(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                Example.concatenate(Arrays.asList(list1, list2))
        );

        Assert.assertEquals(
                Arrays.asList(1, 2, 3, 4, 5),
                Example.concatenate(Arrays.asList(list1, new ArrayList<>()))
        );
    }

}
