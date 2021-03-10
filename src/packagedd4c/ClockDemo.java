package packagedd4c;

public class ClockDemo {

    public static void main(String[] args) throws InterruptedException {
        Clock c1 = new Clock(0);
        Clock c2 = new Clock(230);

        while (true) {
            System.out.println("Clock 1: " + c1.toString());
            System.out.println("Clock 2: " + c2.toString());
            c1.tick();
            c2.tick();
            Thread.sleep(1000);
        }
    }

}
