package d19.d1;

public class Kvadratas extends Figura {

    private double a;

    public Kvadratas(double x, double y, double laipsnis, double a) {
        super(x, y, laipsnis);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double plotas() {
        return a * a;
    }

    @Override
    public double perimetras() {
        return 4 * a;
    }
}
