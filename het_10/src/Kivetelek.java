public class Kivetelek {

    public static void main(String[] main) {

        BonyolultLogika bl = new BonyolultLogika(4, 2, 5);

        // kivételkezelés 1. verzió
        System.out.println("A bonyolult logika számolt értéke: " + bl.getSzamoltHanyados());

        // kivételkezelés 2. verzió
        try {
            System.out.println("A bonyolult logika számolt értéke a 2. verzióban: " + bl.getSzamoltHanyadosRaw());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Hiba jött a hívótól: " + e.getMessage());
        }

        System.out.println("Program vége.");

    }

}
