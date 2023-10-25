public class Teszt {

    public static void main(String[] args) {

        Hallgato h1 = new Hallgato("AE45TGZ", "Gipsz Jakab", "gipszjakab@abc.com");

        Tantargy t1 = new Tantargy("Programozás", 5);

        System.out.println("Ügyintézés indul");
        Ugyintezes u1 = new Ugyintezes(h1, t1);

        System.out.println("Az elbírálás elindult");
        u1.elbiralas(true);
        System.out.println("Az ügyintézés lezárult");
        System.out.println(u1.getEredmeny());

    }

}
