package package4c70;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            int num = generator.nextInt(50);
            while (numbers.contains(num) || num == 0) {
                num = generator.nextInt(50);
            }

            numbers.add(num);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers.get(i));
        }

        System.out.println("Bonus Number: " + numbers.get(6));
    }
}
