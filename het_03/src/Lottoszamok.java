import java.util.ArrayList;

public class Lottoszamok {

    public static void main(String[] args) {

        // Véletlen szám: Math.random();
        // x -> (int)Math.random() * 90
        ArrayList<Integer> lottoszamok = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lottoszamok.add((int) (Math.random() * 90) + 1);
        }
        System.out.println("Lottószámok: " + lottoszamok);

    }

}
