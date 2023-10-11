public class RaktarMain {

    public static void main(String[] args) {

        Raktar raktar = new Raktar(10);

        raktar.addTermek(new Elelmiszer("kókuszdió", 1000));
        raktar.addTermek(new Termek("bögre", 1200));

        raktar.addTermek(new MinosegiTermek("Ferrari", 40000000, "piros"));

        raktar.addTermek(new GagyiKinaiTermek("Occó Audi", 400000, "kék"));
        raktar.addTermek(new GagyiKinaiTermek("Pici Bögre", 300, "zöld"));

        raktar.removeTermek(1);

        System.out.println(raktar.toString());

        raktar.getOsszErtekTeljes();

    }

}
