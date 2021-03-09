package packagefe94;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static List<String> reverseEachString(List<String> inp) {
        return inp.stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.toList());
    }

    public static List<String> reverseEachStringMonolithic(List<String> inp) {
        return inp.stream().map(Example::reverseString).collect(Collectors.toList());
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static List<Double> sqrtsOfFirstDigits(List<String> input) {
        return input.stream()
                .filter(Example::isInt)
                .map(s -> Character.getNumericValue(s.charAt(0)))
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

    public static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
        return input.stream()
                .filter(Example::isInt)
                .map(s -> Math.sqrt(Character.getNumericValue(s.charAt(0))))
                .collect(Collectors.toList());
    }

    private static Boolean isInt(String s) {
        try {
            Integer.parseInt(s.substring(0, 1));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> inp = new ArrayList();
        inp.addAll(List.of("hello", "world", "why", "yes"));
        System.out.println(Example.reverseEachString(inp));
        System.out.println(Example.reverseEachStringMonolithic(inp));

        inp.addAll(List.of("2hello", "wut", "8hmm", "53firstNO?"));

        System.out.println(Example.sqrtsOfFirstDigits(inp));
        System.out.println(Example.sqrtsOfFirstDigitsMonolithic(inp));
    }

}
