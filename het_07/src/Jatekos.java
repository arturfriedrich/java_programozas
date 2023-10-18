public class Jatekos implements Comparable<Jatekos> {

    private String nev;
    private int mezszam;
    private String poszt;

    public Jatekos(String nev, int mezszam, String poszt) {
        this.nev = nev;
        this.mezszam = mezszam;
        this.poszt = poszt;
    }

    public String getNev() {
        return nev;
    }

    public int getMezszam() {
        return mezszam;
    }

    public String getPoszt() {
        return poszt;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setMezszam(int mezszam) {
        this.mezszam = mezszam;
    }

    public void setPoszt(String poszt) {
        this.poszt = poszt;
    }

    @Override
    public String toString() {
        return String.format("%-20s%6d%20s", nev, mezszam, poszt);
    }

    @Override
    public int compareTo(Jatekos o) {
        return this.toString().compareTo(o.toString());
    }
}
