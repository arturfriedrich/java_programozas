public class FuggvenyKompozicio implements Fuggveny {

    private Fuggveny f;
    private Fuggveny g;

    public FuggvenyKompozicio(Fuggveny f, Fuggveny g) {
        this.f = f;
        this.g = g;
    }

    @Override
    public double y(double x) {
        return f.y(g.y(x));
    }

}
