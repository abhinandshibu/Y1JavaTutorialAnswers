package package1486;

import java.util.stream.IntStream;

public class Demo {

    public static void transferStacks(StringStack dst, StringStack src) {
        while (!src.isEmpty()) {
            dst.push(src.pop());
        }
    }

    public static void main(String[] args) {
        StringStack arr = new StringStackArray();
        StringStack list = new StringStackList();

        IntStream.range(19, 36)
                .mapToObj(Integer::toString)
                .forEach(arr::push);

        transferStacks(list, arr);
        assert arr.isEmpty();

        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }

    }

}
