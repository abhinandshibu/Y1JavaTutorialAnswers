package package85bb;

import java.util.stream.IntStream;

public class Demo {

    public static void transferStacks(StringStack dst, StringStack src) {
        while (!src.isEmpty()) {
            dst.push(src.pop());
        }
    }

    public static void main(String[] args) {

        StringStack arrStack = new StringStackArray();
        StringStack listStack = new StringStackList();

        IntStream.range(10, 23)
                .forEach(n -> arrStack.push(Integer.toString(n)));

        transferStacks(listStack, arrStack);

        System.out.println(listStack.toString());
        System.out.println(arrStack.toString());

    }

}
