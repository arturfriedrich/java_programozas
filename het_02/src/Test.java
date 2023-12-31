public class Test {

    public static void main(String[] args) {

        Kutya k1 = new Kutya("Buksi", 3, "vizsla");

        // a setKor metódus csak akkor állítja be az értéket, ha az 1 és 15 között van
        k1.setKor(4);
        // a setKor metódus nem állítja be az értéket, mert -2 nem esik az 1 és 15 közé
        k1.setKor(-2);

        System.out.println(k1.getNev());
        System.out.println(k1.getKor());

        System.out.println(k1.toString());

        KeresoKutya k2 = new KeresoKutya("Bodri", 2, "labrador", 100);

        k2.fajta = "komondor";                  // ez nem javasolt mért más osztályok is elérhetik az adattagot
        System.out.println(k2.toString());
        System.out.println("Kor: " + k2.getKor());
        System.out.println("Keresési hatékonyság: " + k2.getKeresesiHatekonysag() + "%. ");

        ArviziKeresoKutya k3 = new ArviziKeresoKutya("Sajtos", 1, "komondor", 100, 10);

        System.out.println(k3.toString());
        System.out.println("Merülési mélység: " + k3.getMerulesiMelyseg() + "m.");

    }

}
