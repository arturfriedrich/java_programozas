public class Kutyabarat {

    public static void main(String[] args) {

        Gazdi iza = new Gazdi("Iza", 25);
        Gazdi eva = new Gazdi("Eva", 30);

        iza.addKutya("Bodri");
        iza.addKutya("Rex");
        iza.addKutya("Bikfic");

        eva.addKutya("Lara");
        eva.addKutya("Morzsi");
        eva.addKutya("Gyilkos");
        eva.addKutya("Brúnó");

        System.out.println(iza);
        System.out.println(eva);

        System.out.println("Ennyi kutyája van Izának, akinek a neve hosszabb 4 karakternél: " + iza.hanyNegynelHosszabb());
        System.out.println("Ennyi kutyája van Évának, akinek a neve hosszabb 4 karakternél: " + eva.hanyNegynelHosszabb());

        System.out.println("Iza kutyái, akiknek a neve B-vel kezdődik:");
        iza.kiirBbetusKutyak();
        System.out.println("Éva kutyái, akiknek a neve B-vel kezdődik:");
        eva.kiirBbetusKutyak();
    }

}
