public class BonyolultLogika {

    private double a;
    private double b;
    private double [] adatok = {1.0, 2.0, 3.0};
    private int i;

    public BonyolultLogika(double a, double b, int i) {
        this.a = a;
        this.b = b;
        this.i = i;
    }

    public double getSzamoltHanyados() {
        double result = Double.NaN;
        try {
            result = 3.24 * a / b + adatok[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hiba jött: " + e.getMessage());
        }
        return result;
    }

    public double getSzamoltHanyadosRaw() throws ArrayIndexOutOfBoundsException {
        return 3.24 * a / b + adatok[i];
    }

}
