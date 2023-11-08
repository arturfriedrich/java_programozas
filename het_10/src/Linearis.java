public class Linearis implements Fuggveny{

    private double a;
    private double b;

    public Linearis(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double y(double x) {
        return a*x+b;
    }

}
