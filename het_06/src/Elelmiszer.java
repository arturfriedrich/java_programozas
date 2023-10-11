public class Elelmiszer implements Raktarozhato {

    private String nev;
    private int ertek;

    public Elelmiszer(String nev, int ertek) {
        this.nev = nev;
        this.ertek = ertek;
    }

    public String getNev() {
        return nev;
    }

    public int getErtek() {
        return ertek;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    @Override
    public String toString() {
        return String.format("%-10s%20d Ft", nev, ertek);
    }

    public String nev() {
        return null;
    }

    public int ertek() {
        return 0;
    }

}
