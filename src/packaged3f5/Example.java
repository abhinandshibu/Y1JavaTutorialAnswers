package packaged3f5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
        return numbers.filter(n -> n instanceof Integer)
                .map(n -> (Integer) n)
                .filter(n -> n > 0);
    }

    public static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(Stream<? extends Number> numbers) {
        return numbers.filter(n -> n instanceof Integer)
                .map(n -> (Integer) n)
                .filter(n -> n > 0);
    }

    public static void main(String[] args) {
        List<Number> numbers = List.of(3, 4.298f, -59.801d, (short) 4);

        System.out.println("Positive integers from " + numbers + " are: "
                + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));

        List<Integer> integers = List.of(1,-2,3,-4,5);
    }

}
