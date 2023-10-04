public class SugarhajtomuvesGep extends RepuloGep {

    private int hatotavolsag;

    public SugarhajtomuvesGep(String type, String flightNumber, int takeOffWeight, int hatotavolsag) {
        super(type, flightNumber, takeOffWeight);
        this.hatotavolsag = hatotavolsag;
    }

    public int getHatotavolsag() {
        return hatotavolsag;
    }

    @Override
    public String toString() {
        return super.toString() + "SugarhajtomuvesGep{" + "hatotavolsag=" + hatotavolsag + '}';
    }

}
