public class Szorzotabla {

        public static void main(String[] args) {
            // a szorzótábla mérete
            int meret = 10;
            // a szorzótábla kiírása
            for (int i = 1; i <= meret; i++) {
                for (int j = 1; j <= meret; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
            }
        }
}
