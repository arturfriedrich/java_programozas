public abstract class Jarmu {

    private String gyarto;
    private String tipus;
    private String rendszam;

    // kell egy ilyen metódus a leszármazottakban
    public abstract int getSzallithatoSzemelyekSzama();

    public Jarmu(String gyarto, String tipus, String rendszam) {
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.rendszam = rendszam;
    }

    public String getGyarto() {
        return gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "gyarto=" + gyarto + ", tipus=" + tipus + ", rendszam=" + rendszam + '}';
    }

}
