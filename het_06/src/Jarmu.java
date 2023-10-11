public class Jarmu {

    private String gyarto;
    private int ar;

    public Jarmu(String gyarto, int ar) {
        this.gyarto = gyarto;
        this.ar = ar;
    }

    public String getGyarto() {
        return gyarto;
    }

    public int getAr() {
        return ar;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return String.format("%-10s%12d Ft", gyarto, ar);
    }

}
