public class Tomb {

    public static void main(String[] args) {

        int[] tomb = new int[5];
        tomb[0] = 2;
        tomb[1] = 4;
        tomb[2] = 6;

        for (int s: tomb) {
            System.out.println(s);
        }

        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }

    }

}
