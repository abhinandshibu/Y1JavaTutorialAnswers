package packagef79b;

public class PerfectPalindromicCubes {
    public static void main(String[] args) {
        for (int x = 1; x <= 1500; x++) {
            int cube = x * x * x;

            StringBuilder sb = new StringBuilder();
            sb.append(cube).reverse();

            if (String.valueOf(cube).equals(sb.toString())) {
                System.out.println(x + " cubed is " + cube);
            }
        }
    }
}
