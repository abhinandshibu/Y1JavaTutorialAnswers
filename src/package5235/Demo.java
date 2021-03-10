package package5235;

public class Demo {

    public static void main(String[] args) throws Exception {

        Point p1 = new Point(3, 4, 5);
        Point p2 = new Point(3, 4, 5);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        ColouredPoint cp1 = new ColouredPoint(3, 4, 5, new Colour(11, 32, 100));
        ColouredPoint cp2 = new ColouredPoint(3, 4, 5, new Colour(15, 1, 123));
        System.out.println(cp1 == cp2);
        System.out.println(cp1.equals(cp2));

        System.out.println(p1.equals(cp1));
        System.out.println(cp1.equals(p1));

    }

}
