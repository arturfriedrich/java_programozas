import java.util.ArrayList;
import java.util.Objects;

public class Lotto {

    public static void main(String[] args) {

        ArrayList<Integer> szamok = new ArrayList<>();
        szamok.add(11);
        szamok.add(22);
        szamok.add(44);
        szamok.add(66);
        szamok.add(88);

        for (Integer szam : szamok) {
            System.out.print(szam + "\t");
        }
        System.out.println();

        ArrayList<Integer> lottoSzamok = new ArrayList<>();
        while (lottoSzamok.size() < 5) {
            int randomSzam = (int) (Math.random() * 90) + 1;
            if (!lottoSzamok.contains(randomSzam)) {
                lottoSzamok.add(randomSzam);
            }
        }

        lottoSzamok.sort(null);
        for (Integer lottoSzam : lottoSzamok) {
            System.out.print(lottoSzam + "\t");
        }
        System.out.println();

        int talalat = 0;
        for (Integer lottoSzam : lottoSzamok) {
            for (Integer szam : szamok) {
                if (Objects.equals(lottoSzam, szam)) {
                    talalat++;
                }
            }
        }

        if (talalat == 3) {
            System.out.println("Peti 20 191 forintot nyert!");
        } else if (talalat == 4) {
            System.out.println("Peti 424 522 forintot nyert!");
        } else if (talalat == 5) {
            System.out.println("Peti 22 614 921 forintot nyert!");
        } else {
            System.out.println("Peti nem nyert semmit!");
        }

    }

}
