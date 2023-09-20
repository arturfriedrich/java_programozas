public class StringFeladat {

    public static void main(String[] args) {
        String szoveg = "Holnap csütörtök lesz!";
        System.out.println("a) Hány ö betű volt?");
        System.out.println("b) Az utolsó karakter ? volt-e?");
        System.out.println("c) Cseréljük le a ! karaktert egy + jelre!");

        int szamlalo = 0;
            for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.charAt(i) == 'ö') {
                szamlalo++;
            }
        }
        System.out.println("a) " + szamlalo + " db ö betű volt.");

        System.out.println(szoveg.endsWith("?") ? "b) Igen" : "b) Nem");
        szoveg = szoveg.replace('!', '+');
        System.out.println("c) " + szoveg);
    }

}
