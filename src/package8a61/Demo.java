package package8a61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Demo {

    public static IntSet readIntegers(int n) {
        IntSet store = (n > 10 ? new MemoryEfficientIntSet() : new SpeedEfficientIntSet());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        IntStream.range(0, n)
                .forEach(iteration -> {
                    System.out.println("Enter int: ");
                    try {
                        store.add(Integer.parseInt(br.readLine()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

        return store;
    }

    public static void main(String[] args) throws IOException {
        IntSet intSet = readIntegers(5);

        System.out.println("Set is: " + intSet.getClass().getName());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter an int, to be tested for membership: ");
            Integer intToCheck = Integer.parseInt(br.readLine());
            System.out.println("Set contains " + intToCheck + ": " + intSet.contains(intToCheck));
        }

    }

}
