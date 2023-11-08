public class Konstans implements Fuggveny{

    private double c;

    public Konstans(double c) {
        this.c = c;
    }

    @Override
    public double y(double x) {
        return c;
    }

}
