import java.util.ArrayList;

public class BufeMain {

    public static void main(String[] args) {

        Etel melegszendvics = new Etel("Melegszendvics", 1300);
        melegszendvics.addHozzavalo(new Hozzavalo("Kenyér", 0.3, 500));
        melegszendvics.addHozzavalo(new Hozzavalo("Bacon", 0.1, 3000));
        melegszendvics.addHozzavalo(new Hozzavalo("Lilahagyma", 1, 50));
        melegszendvics.addHozzavalo(new Hozzavalo("Telföl", 0.5, 200));

        System.out.println(melegszendvics);

        Ital limonade = new Ital("Limonádé", 500);
        limonade.addHozzavalo(new Hozzavalo("Citrom", 1, 250));
        limonade.addHozzavalo(new Hozzavalo("Ásványvíz", 0.5, 250));
        limonade.addHozzavalo(new Hozzavalo("Cukor", 0.005, 1000));

        System.out.println(limonade);

        Etel piskota = new Etel("Lekváros piskóta", 800);
        piskota.addHozzavalo(new Hozzavalo("Piskóta", 1, 300));
        piskota.addHozzavalo(new Hozzavalo("Cukor", 0.1, 1000));
        piskota.addHozzavalo(new Hozzavalo("Lekvár", 0.02, 2000));

        System.out.println(piskota);

        ArrayList<Termek> kinalat = new ArrayList<>();
        kinalat.add(melegszendvics);
        kinalat.add(limonade);
        kinalat.add(piskota);

        System.out.println("Cukros termékek:");
        for (Termek termek : kinalat) {
            if (termek.vanBenneCukor()) {
                System.out.println("- " + termek.getNev());
            }
        }

        System.out.println("\nEgy termék előállítási költsége:");
        System.out.println("- " + melegszendvics.getNev() + ": " + melegszendvics.getEloallitasiKoltseg() + " Ft");
        System.out.println("- " + limonade.getNev() + ": " + limonade.getEloallitasiKoltseg() + " Ft");
        System.out.println("- " + piskota.getNev() + ": " + piskota.getEloallitasiKoltseg() + " Ft");

        System.out.println("\nA legdrágább előállítási költségű termék:");
        String legdragabbTermek = "";
        int legdragabbKoltseg = 0;
        for (Termek termek : kinalat) {
            if (termek.getEloallitasiKoltseg() > legdragabbKoltseg) {
                legdragabbTermek = termek.getNev();
                legdragabbKoltseg = termek.getEloallitasiKoltseg();
            }
        }
        System.out.println("- " + legdragabbTermek + ": " + legdragabbKoltseg + " Ft");

        System.out.println("\nA legnagyobb haszonnal rendelkező termék:");
        legdragabbTermek = "";
        legdragabbKoltseg = 0;
        for (Termek termek : kinalat) {
            if (termek.getAr() - termek.getEloallitasiKoltseg() > legdragabbKoltseg) {
                legdragabbTermek = termek.getNev();
                legdragabbKoltseg = termek.getAr() - termek.getEloallitasiKoltseg();
            }
        }
        System.out.println("- " + legdragabbTermek + ": " + legdragabbKoltseg + " Ft");

    }

}
