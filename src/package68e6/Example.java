package package68e6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static List<Integer> concatenate(List<List<Integer>> lists) {
        return lists.stream()
                .reduce(new ArrayList<>(),
                        (l1, l2) -> {
                            List<Integer> result = new ArrayList<>(l1);
                            result.addAll(l2);
                            return result;
                        });
    }

    public static int findMin(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE, Math::min);
    }

    public static int findMinOrZero(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Math::min)
                .orElse(0);
    }

    public static int findMax(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer.MIN_VALUE, (n1, n2) -> Math.max(n1, n2));
    }

    public static int findMaxOrZero(List<Integer> numbers) {
        return numbers.stream()
                .reduce((n1, n2) -> Math.max(n1, n2))
                .orElse(0);
    }

    public static int findMinOfMaxes(List<List<Integer>> listOfLists) {
        return findMin(
                listOfLists.stream()
                        .map(Example::findMax)
                        .collect(Collectors.toList()));
    }

}
