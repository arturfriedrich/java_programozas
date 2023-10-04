public interface RepulniTudo {

    public default int getSebesseg() {
        if (this instanceof Madar) {
            return ((Madar) this).getSebesseg();
        } else if (this instanceof Repulo) {
            return ((Repulo) this).getVegsebesseg();
        } else {
            return 0;
        }
    }
}
