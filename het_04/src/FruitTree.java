public class FruitTree {

    private String name;
    private int numberOfFruits;

    public FruitTree(String name, int numberOfFruits) {
        this.name = name;
        this.numberOfFruits = numberOfFruits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

    @Override
    public String toString() {
        return "FruitTree: " + name + ", numberOfFruits: " + numberOfFruits + ".";
    }

}
