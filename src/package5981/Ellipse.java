package package5981;

public class Ellipse extends Shape {

    private double semiMajor;
    private double semiMinor;

    public Ellipse(double semiMajor, double semiMinor) {
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }

    public Pair<Double, Double> getSize() {
        return new Pair<>(semiMajor, semiMinor);
    }

    public void setSize(Pair<Double, Double> p) {
        semiMajor = p.getFirst();
        semiMinor = p.getSecond();
    }

    @Override
    public boolean isCircle() {
        return semiMajor == semiMinor;
    }

    @Override
    public boolean isSquare() {
        return false;
    }

}
