public class Masodfoku implements Fuggveny{

    private double a, b, c;

    public Masodfoku(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double y(double x) {
        return a*x*x+b*x+c;
    }

}
