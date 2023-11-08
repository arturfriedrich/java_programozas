public enum DobozMeretExtra {

    S("5x5x5"),
    M("10x10x10"),
    L("15x15x15"),
    XL("20x20x20"),
    XXL("25x25x25");

    private String meret;

    DobozMeretExtra(String meret) {
        this.meret = meret;
    }

    public String getMeret() {
        return meret;
    }

}
