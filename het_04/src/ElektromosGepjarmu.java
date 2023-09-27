public class ElektromosGepjarmu extends Gepjarmu implements Elektromos {

    public ElektromosGepjarmu(String gyarto, String tipus, String rendszam, int teljesitmenyKilowatt) {
        super(gyarto, tipus, rendszam, teljesitmenyKilowatt);
    }

    @Override
    public int getKapacitasKw() {
        return 100;
    }

}
