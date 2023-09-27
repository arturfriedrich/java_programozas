public class HybridGepjarmu extends Gepjarmu implements Elektromos, Benzines{

    private String szin;

    public HybridGepjarmu(String gyarto, String tipus, String rendszam, int teljesitmenyKilowatt, String szin) {
        super(gyarto, tipus, rendszam, teljesitmenyKilowatt);
        this.szin = szin;
    }

    @Override
    public int getKapacitasKw() {
        return 20;
    }

    @Override
    public int fogyasztasLiterben() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString() + "szin=" + szin + '}';
    }

}
