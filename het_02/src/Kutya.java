public class Kutya {

    private String nev;
    private int kor;
    protected String fajta;         // a protected adattagokat az osztály és az örökölt osztályok is elérhetik

    // Konstruktor, példányosításkor hívódik meg
    public Kutya(String nev, int kor, String fajta) {
        this.nev = nev;         // data member
        this.kor = kor;
        this.fajta = fajta;
    }

    // Getterek
    public int getKor() {
        return kor;
    }

    public String getNev() {
        return nev;
    }

    public String getFajta() {
        return fajta;
    }

    // Setterek - nincsen visszatérési értékük, csak beállítják az adattagot
    public void setKor(int kor) {
        if (kor > 0 && kor < 15) {
            this.kor = kor;
        } else {
            System.err.println("setKor: A kutya életkora 1 és 15 között lehet: " + kor + " érvénytelen.");
        }
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    // Kiírjuk vele az objeltum alapértelmezett szöveges reprezentációját
    public String toString() {
        return "Név: " + this.nev +
                ", kor: " + this.kor +
                ", fajtája: " + this.fajta + ".";
    }

}
