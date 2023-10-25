public class TesztGenerikus {

    public static void main(String[] args) {

        GenerikusTipus generikus = new GenerikusTipus("Hello there!");

        var ertek = generikus.getErtek();
        System.out.println("értéke: " + ertek);
        System.out.println("típusa: " + ertek.getClass().getName());

        GenerikusTipus<Integer> generikus2 = new GenerikusTipus<>(42);
        var ertek2 = generikus2.getErtek();
        System.out.println("értéke: " + ertek2);
        System.out.println("típusa: " + ertek2.getClass().getName());

    }

}
