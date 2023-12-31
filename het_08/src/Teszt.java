public class Teszt {

    public static void main(String[] args) {

        Hallgato h1 = new Hallgato("AE45TGZ", "Gipsz Jakab", "gipszjakab@abc.com");

        Tantargy t1 = new Tantargy("Programozás", 5);

        Ugyintezes to = new Ugyintezes("Tóth Árpád");

        System.out.println("Ügyintézés indul");
        Kerveny k1 = new Kerveny(h1, t1);
        System.out.println("Kérvény állapota: " + k1.isEredmeny());

        to.addKerveny(k1);

        System.out.println("Az elbírálás elindult");
        k1.elbiralas(Kerveny.Statusz.ELBIRALAS_ALATT);
        System.out.println("Kérvény állapota: " + k1.isEredmeny());
        k1.elbiralas(true);

        System.out.println("Az ügyintézés lezárult");
        System.out.println("Kérvény állapota: " + k1.isEredmeny());

        System.out.println("Elutasított kérvények száma: " + to.getElutasitottKervenyekSzama());
        System.out.println("Elfogadott kérvények száma: " + to.getElfogadottKervenyekSzama());

    }

}
