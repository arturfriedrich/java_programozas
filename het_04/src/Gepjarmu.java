public class Gepjarmu extends Jarmu {

    private int teljesitmenyKilowatt;

    public Gepjarmu(String gyarto, String tipus, String rendszam, int teljesitmenyKilowatt) {
        super(gyarto, tipus, rendszam);
        this.teljesitmenyKilowatt = teljesitmenyKilowatt;
    }

    public int getTeljesitmenyKilowatt() {
        return teljesitmenyKilowatt;
    }

    public void setTeljesitmenyKilowatt(int teljesitmenyKilowatt) {
        this.teljesitmenyKilowatt = teljesitmenyKilowatt;
    }

    @Override
    public int getSzallithatoSzemelyekSzama() {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString() + "teljesitmenyKilowatt=" + teljesitmenyKilowatt + '}';
    }

}
