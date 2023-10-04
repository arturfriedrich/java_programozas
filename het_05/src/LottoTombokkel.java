public class LottoTombokkel {

    public static void main(String[] args) {

        int[] szamok = new int[]{1, 2, 4, 6, 8};

        for (int szam : szamok) {
            System.out.print(szam + "\t");
        }

        System.out.println();

        int[] lottoszamok = new int[5];
        int index = 0;
        while (index < lottoszamok.length) {
            int randomSzam = (int) (Math.random() * 10) + 1;
            boolean van = false;
            for (int i = 0; i < index; i++) {
                if (lottoszamok[i] == randomSzam) {
                    van = true;
                    break;
                }
            }
            if (!van) {
                lottoszamok[index] = randomSzam;
                index++;
            }
        }

        for (int i = 0; i < lottoszamok.length / 2; i++) {
            for (int j = i; j < lottoszamok.length - i - 1; j++) {
                if (lottoszamok[j] > lottoszamok[j + 1]) {
                    int temp = lottoszamok[j];
                    lottoszamok[j] = lottoszamok[j + 1];
                    lottoszamok[j + 1] = temp;
                }
            }
            for (int j = lottoszamok.length - 2 - i; j > i; j--) {
                if (lottoszamok[j] < lottoszamok[j - 1]) {
                    int temp = lottoszamok[j];
                    lottoszamok[j] = lottoszamok[j - 1];
                    lottoszamok[j - 1] = temp;
                }
            }
        }

        for (int szam : lottoszamok) {
            System.out.print(szam + "\t");
        }

        System.out.println();

        int talalat = 0;
        for (int lottoszam : lottoszamok) {
            for (int szam : szamok) {
                if (lottoszam == szam) {
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
