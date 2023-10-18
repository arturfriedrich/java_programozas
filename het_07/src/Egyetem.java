public class Egyetem {

    public static void main(String[] args) {

        Egyetemista lajos = new Egyetemista("Lajos", 20);

        lajos.addTantargy(new Tantargy("Programozás", 5));
        lajos.addTantargy(new Tantargy("Matematika", 4));
        lajos.addTantargy(new Tantargy("Fizika", 3));
        lajos.addTantargy(new Tantargy("Kémia", 3));

        System.out.println(lajos);

        System.out.println(lajos.getNev() + " átlaga: " + lajos.atlag());

        Egyetemista gizi = new Egyetemista("Gizi", 21);

        gizi.addTantargy2("Programozás", 2);
        gizi.addTantargy2("Matematika", 5);
        gizi.addTantargy2("Fizika", 3);
        gizi.addTantargy2("Kémia", 4);

        System.out.println(gizi);

        System.out.println(gizi.getNev() + " átlaga: " + gizi.atlag());

    }

}
