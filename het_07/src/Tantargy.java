public class Tantargy {

    private String nev;
    private float osztalyzat;

    public Tantargy(String nev, int osztalyzat) {
        this.nev = nev;
        this.osztalyzat = osztalyzat;
    }

    public String getNev() {
        return this.nev;
    }

    public float getOsztalyzat() {
        return this.osztalyzat;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setOsztalyzat(int osztalyzat) {
        this.osztalyzat = osztalyzat;
    }

    @Override
    public String toString() {
        return this.nev + " " + this.osztalyzat;
    }

}
