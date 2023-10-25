public class GenerikusTipus<T> {

    private T ertek;

    public GenerikusTipus(T ertek) {
        this.ertek = ertek;
    }

    public T getErtek() {
        return ertek;
    }

}

class Generikus2<T extends Comparable> {

}
