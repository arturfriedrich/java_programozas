public class szamla {

    public static void main(String[] args) {

        String[] italok = new String[]{"sör", "bor", "pálinka"};
        int[] arak = new int[]{400, 2000, 7000};
        int ossz = 0;

        StringBuffer sb = new StringBuffer("Italok:\n");
        sb.append("---------------------------------\n");
        for (int  i = 0; i < italok.length; i++) {
            ossz += arak[i];
            sb.append("\t" + italok[i] + "\t" + arak[i] + " Ft\n");
        }

        sb.append("---------------------------------\n");
        sb.append("\tVégösszeg:" + ossz + " Ft\n");

        System.out.println(sb.toString());

    }

}
