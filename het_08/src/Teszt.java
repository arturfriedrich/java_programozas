public class Teszt {

    public static void main(String[] args) {

        Hallgato h1 = new Hallgato("AE45TGZ", "Gipsz Jakab", "gipszjakab@abc.com");

        Tantargy t1 = new Tantargy("Programozás", 5);

        Ugyintezes to = new Ugyintezes("Tóth Árpád");

        System.out.println("Ügyintézés indul");
        Kerveny k1 = new Kerveny(h1, t1);

        to.addKerveny(k1);

        System.out.println("Az elbírálás elindult");
        k1.elbiralas(true);

        System.out.println("Az ügyintézés lezárult");
        System.out.println(k1.getEredmeny());

    }

}
