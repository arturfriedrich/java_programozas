public class Teszt {

    public static void main(String[] args) {

        Konstans k1 = new Konstans(42);
        Linearis l1 = new Linearis(1, 3);
        Masodfoku m1 = new Masodfoku(1, 4, 5);
        Sinus s1 = new Sinus();

        System.out.println("Konstans x=2 helyen: " + k1.y(2));
        System.out.println("Linearis x=2 helyen: " + l1.y(2));
        System.out.println("Masodfoku x=2 helyen: " + m1.y(2));
        System.out.println("Sinus x=2 helyen: " + s1.y(2));
        System.out.println("-------------------------");

        FuggvenyOsszeg osszeg1 = new FuggvenyOsszeg(k1, l1);
        System.out.println("Konstans + Linearis x=2 helyen: " + osszeg1.y(2));

        FuggvenyOsszeg osszeg2 = new FuggvenyOsszeg(l1, m1);
        System.out.println("Linearis + Masodfoku x=2 helyen: " + osszeg2.y(2));

        FuggvenyOsszeg osszeg3 = new FuggvenyOsszeg(s1, m1);
        System.out.println("Sinus + Masodfoku x=2 helyen: " + osszeg3.y(2));

        FuggvenyOsszeg osszeg4 = new FuggvenyOsszeg(osszeg1, osszeg2);
        System.out.println("Konstans + Linearis + Linearis + Masodfoku x=2 helyen: " + osszeg4.y(2));

        System.out.println("-------------------------");

        FuggvenyKompozicio kompozicio1 = new FuggvenyKompozicio(k1, l1);
        System.out.println("Konstans o Linearis x=2 helyen: " + kompozicio1.y(2));

        FuggvenyKompozicio kompozicio2 = new FuggvenyKompozicio(l1, m1);
        System.out.println("Linearis o Masodfoku x=2 helyen: " + kompozicio2.y(2));

        FuggvenyKompozicio kompozicio3 = new FuggvenyKompozicio(s1, m1);
        System.out.println("Sinus o Masodfoku x=2 helyen: " + kompozicio3.y(2));


    }

}
