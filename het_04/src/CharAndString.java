import java.util.ArrayList;

public class CharAndString {

    public static void main(String[] args) {

        short uppercaseCounter = 0;

        ArrayList<String> vers = new ArrayList<String>();
        vers.add("Alma alma");
        vers.add("piros alma");
        vers.add("odafönn-a-fán.");
        vers.add("Ha elérném,");
        vers.add("nem kímélném,");
        vers.add("leszakítanám.");

        for (String sor : vers) {
            if (Character.isUpperCase(sor.charAt(0))) {
                uppercaseCounter++;
            }
        }


        // a) Hány nagybetűvel kezdődő sor van?
        System.out.println("Nagybetűvel kezdődő sorok száma: " + uppercaseCounter);


        // b) Volt-e "alma" tartalmű TELJES sor?
        boolean almaSor = false;
        for (int i = 0; i < vers.size(); i++) {
            if (vers.get(i).equals("alma alma")) almaSor = true;
        }
        System.out.println("Volt-e alma tartalmú sor: " + almaSor);


        // c) Volt-e olyan sor, amiben szerepelt az "alma" szó?
        boolean vanAlma2 = false;
        for (String sor : vers) {
            String[] sorSplit = sor.split(" ");
            for (String szo : sorSplit) {
                if (szo.equals("alma")) vanAlma2 = true;
            }
        }
        System.out.println("Volt-e alma szó: " + vanAlma2);


        // d) Az első szóban hány betű és hány szám volt?
        String[] sorSplit = vers.get(0).split(" ");
        short betuCounter = 0;
        short szamCounter = 0;
        for (char c : sorSplit[0].toCharArray()) {
            if (Character.isDigit(c)) szamCounter++;
            if (Character.isLetter(c)) betuCounter++;
        }
        System.out.println("Az első szóban " + betuCounter + " betű és " + szamCounter + " szám volt.");


        // e) Hogy nézne ki az első szó az első és utolsó betűje nélkül?
        System.out.println("Az első szó az első és utolsó betűje nélkül: " + sorSplit[0].substring(1, sorSplit[0].length()-1));


        // f) Ahol volt kötőjel, ott daraboljuk fel, és írjuk ki a részeit!
        for (String sor : vers) {
            if (sor.contains("-")) {
                String[] sorSplit2 = sor.split("-");
                for (String szo : sorSplit2) {
                    System.out.println(szo);
                }
            }
        }
    }

}
