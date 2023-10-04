public class AircraftMain {

    public static void main(String[] args) {
        RepuloGep repuloGep = new RepuloGep("Boeing 737", "LH1234", 100000);
        SugarhajtomuvesGep sugarhajtomuvesGep = new SugarhajtomuvesGep("Boeing 737", "LH1234", 100000, 1000);
        TurbolegcsavarosGep turbolegcsavarosGep = new TurbolegcsavarosGep("Boeing 737", "LH1234", 100000, 1000);
        Cargo cargo = new Cargo("Boeing 737", "LH1234", 100000, 1000, 100);
        Utasszallito utasszallito = new Utasszallito("Boeing 737", "LH1234", 100000, 1000, 100);
        Charter charter = new Charter("Boeing 737", "LH1234", 100000, 1000, 100, 100);

        System.out.println(repuloGep);
        System.out.println(sugarhajtomuvesGep);
        System.out.println(turbolegcsavarosGep);
        System.out.println(cargo);
        System.out.println(utasszallito);
        System.out.println(charter);
    }
}
