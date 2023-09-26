public class SnowWhite {

    public static void main(String[] args) {

        SnowWhiteWorker SnowWhite = new SnowWhiteWorker("Hófehérke", 20, "ügyvezető", 1200);
        SnowWhiteWorker Tudor = new SnowWhiteWorker("Tudor", 60, "mérnök", 750);
        SnowWhiteWorker Morgo = new SnowWhiteWorker("Morgó", 65, "műszakvezető", 600);
        SnowWhiteWorker Vidor = new SnowWhiteWorker("Vidor", 53, "bányász", 400);
        SnowWhiteWorker Szundi = new SnowWhiteWorker("Szundi", 55, "bányász", 400);
        SnowWhiteWorker Szende = new SnowWhiteWorker("Szende", 42, "bányász", 400);
        SnowWhiteWorker Hapci = new SnowWhiteWorker("Hapci", 50, "bányász", 400);

        // a) Szundi harmadszor aludt el, ezért levontak tőle háromnapi fizetést.
        Szundi.raiseSalary(-(400/3));

        // b) Kuka kap egy esélyt – felvették bányásznak, 500 arany fizetésért.
        SnowWhiteWorker Kuka = new SnowWhiteWorker("Kuka", 50, "bányász", 500);

        // c) A bányászok fellázadtak, amiért Kuka többet keres, ezért 1 hétig nem dolgoztak.
        // A fizetésükből levonták az 5 munkanapot, de kaptak 200 arany fizetésemelést.
        // (Szundi nem mert lázadni, ő végigdolgozta azt a hetet is – neki is emeltek).
        Vidor.raiseSalary(-(400/5));
        Szende.raiseSalary(-(400/5));
        Hapci.raiseSalary(-(400/5));

        Vidor.raiseSalary(200);
        Szende.raiseSalary(200);
        Hapci.raiseSalary(200);
        Szundi.raiseSalary(200);

        // d) Kuka megsértődött, amiért neki nem jár emelés, és felmondott. 1 heti fizetés jár neki.
        Kuka.setSalary(400/5);

        // e) Óriási megrendelést kaptak a királyfitól, ezért minden (még állományban lévő)
        // dolgozó 100 arany bónuszt kapott, Hófehérke 300-at, mert ő a főnök.
        SnowWhite.raiseSalary(300);
        Tudor.raiseSalary(100);
        Morgo.raiseSalary(100);
        Vidor.raiseSalary(100);
        Szende.raiseSalary(100);
        Hapci.raiseSalary(100);
        Szundi.raiseSalary(100);

        System.out.println(SnowWhite.toString());
        System.out.println(Tudor.toString());
        System.out.println(Morgo.toString());
        System.out.println(Vidor.toString());
        System.out.println(Szende.toString());
        System.out.println(Hapci.toString());
        System.out.println(Szundi.toString());
        System.out.println(Kuka.toString());

    }

}
