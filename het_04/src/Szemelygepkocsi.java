public class Szemelygepkocsi extends Gepjarmu {

    private int ajtokSzama;

    public Szemelygepkocsi(String gyarto, String tipus, String rendszam, int teljesitmenyKilowatt, int ajtokSzama) {
        super(gyarto, tipus, rendszam, teljesitmenyKilowatt);
        this.ajtokSzama = ajtokSzama;
    }

    @Override
    public int getSzallithatoSzemelyekSzama() {
        return 4;
    }

    public int getAjtokSzama() {
        return ajtokSzama;
    }

    public void setAjtokSzama(int ajtokSzama) {
        this.ajtokSzama = ajtokSzama;
    }

    @Override
    public String toString() {
        return super.toString() + "ajtokSzama=" + ajtokSzama + '}';
    }

}
