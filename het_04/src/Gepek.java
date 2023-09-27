public class Gepek {

    public static void main(String[] args) {

        Jarmu kocsi1 = new Gepjarmu("Opel", "Astra", "OPA-278", 100);
        System.out.println(kocsi1);
        System.out.println("Szallithato szemelyek szama: " + kocsi1.getSzallithatoSzemelyekSzama());

        Szemelygepkocsi kocsi2 = new Szemelygepkocsi("Opel", "Kadett", "OPK-354", 120, 5);
        System.out.println(kocsi2);
        System.out.println("Szallithato szemelyek szama: " + kocsi2.getSzallithatoSzemelyekSzama());

        ElektromosGepjarmu kocsi3 = new ElektromosGepjarmu("Tesla", "Model S", "TMS-234", 477);
        System.out.println(kocsi3);
        System.out.println("Szallithato szemelyek szama: " + kocsi3.getSzallithatoSzemelyekSzama());

        Elektromos kocsi4 = new ElektromosGepjarmu("Tesla", "Model S", "TME-987", 465);
        System.out.println(kocsi4);
        System.out.println("Kapacitas: " + kocsi4.getKapacitasKw());

        BenzinesGepjarmu kocsi5 = new BenzinesGepjarmu("Ford", "Mustang", "GZA-456", 320);
        System.out.println(kocsi5);
        System.out.println("Fogyasztas: " + kocsi5.fogyasztasLiterben());

        HybridGepjarmu kocsi6 = new HybridGepjarmu("Toyota", "Prius", "TZA-123", 100, "fekete");
        System.out.println(kocsi6);
        System.out.println("Fogyasztas: " + kocsi6.fogyasztasLiterben());
        System.out.println("Kapacitas: " + kocsi6.getKapacitasKw());

    }

}
