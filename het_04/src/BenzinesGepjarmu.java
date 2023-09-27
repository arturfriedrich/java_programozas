public class BenzinesGepjarmu extends Gepjarmu implements Benzines {

    public BenzinesGepjarmu(String gyarto, String tipus, String rendszam, int teljesitmenyKilowatt) {
        super(gyarto, tipus, rendszam, teljesitmenyKilowatt);
    }

    @Override
    public int fogyasztasLiterben() {
        return 5;
    }

}
