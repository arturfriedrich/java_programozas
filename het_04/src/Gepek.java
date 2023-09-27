public class Gepek {

    public static void main(String[] args) {

        Jarmu kocsi1 = new Gepjarmu("Opel", "Astra", "ABC-123", 100);
        System.out.println(kocsi1);
        System.out.println("Szallithato szemelyek szama: " + kocsi1.getSzallithatoSzemelyekSzama());

        Szemelygepkocsi kocsi2 = new Szemelygepkocsi("Opel", "Kadett", "ABC-123", 120, 5);
        System.out.println(kocsi2);
        System.out.println("Szallithato szemelyek szama: " + kocsi2.getSzallithatoSzemelyekSzama());

    }

}
