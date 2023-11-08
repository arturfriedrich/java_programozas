public class FuggvenyOsszeg implements Fuggveny{

    private Fuggveny f;
    private Fuggveny g;

    public FuggvenyOsszeg(Fuggveny f, Fuggveny g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public double y(double x) {
        return f.y(x)+g.y(x);
    }

}
