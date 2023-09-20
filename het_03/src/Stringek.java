import java.util.Arrays;

public class Stringek {

    public static void main(String[] args) {

        String s = "alma";
        String s2 = new String("körte");
        System.out.println("szöveg: " + s);

        System.out.println("szöveg hossza: " + s.length());

        System.out.println("szöveg 2. karaktere: " + s.charAt(1));

        System.out.println("Az 'm' betű első előfordulása: " + s.indexOf('m'));

        System.out.println("Megyegyezik-e 'Alma' szóval? " + s.equals(("Alma")));

        System.out.println("üres-e a sztring? " + s.isEmpty());

        System.out.println("'ma'-ra véhződik-e? " + s.endsWith("ma"));

        System.out.println("Nagybetüs változat: " + s.toUpperCase());

        System.out.println("Szerepel-e az 'al' szövegrész? " + (s.contains("al") ? "Igen" : "Nem"));

        System.out.println("A két sztring egyben: " + s + s2);

        System.out.println("A két sztring egyben: " + s.concat(s2));

        String egyben = s + s2;

        String[] darabok = egyben.split(" ");

        System.out.println(Arrays.toString(darabok));

        System.out.println(Arrays.toString("192.168.0.1".split("\\.")));

        if (Character.isWhitespace(' ')) {
            System.out.println("Ez egy szóköz.");
        }

    }

}
