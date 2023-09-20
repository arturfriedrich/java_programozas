public class Main {

    public static void main(String[] args) {

        int[] szamok = { 9, 12, 20, 7, 25 };

        for (int szam : szamok) {
            System.out.print("Az aktuális szám " + szam);
            if (szam % 2 == 0) {
                System.out.println(" osztható 2-vel.");
            } else if (szam % 5 == 0) {
                System.out.println(" osztható 5-tel.");
            } else {
                System.out.println(" nem osztható 2-vel és 5-tel sem.");
            }
        }

    }

}
