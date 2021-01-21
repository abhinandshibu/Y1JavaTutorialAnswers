package package014e;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumbers {

    public static void main(String[] args) {
        final int maxNum = Integer.parseInt(args[0]);
        final List<Integer> numbers = IntStream.rangeClosed(0, maxNum - 1)
                .boxed().collect(Collectors.toList());
        int noOfNumbersGenerated = 0;

        Random generator = new Random();
        StringBuilder sb = new StringBuilder();

        while (numbers.size() > 0) {
            Integer num = generator.nextInt(maxNum);
            numbers.remove(num);
            sb.append(num);
            noOfNumbersGenerated += 1;

            if(numbers.size() > 0) {
                sb.append(", ");
            }
        }

        System.out.println("Generating random numbers: \n" + sb +
                "\nI had to generate " + noOfNumbersGenerated + " numbers between 0 and "
                + maxNum + " to have produced all such numbers at least once.");
    }
}
