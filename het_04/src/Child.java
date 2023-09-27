public class Child {

    private String name;
    private boolean isHungry;

    public Child(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
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

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void eat(FruitTree tree, int quantity) {
        if (tree.getNumberOfFruits() - quantity > 0) {
            tree.setNumberOfFruits(tree.getNumberOfFruits() - quantity);
            isHungry = false;
        } else {
            System.out.println("Not enough fruits on the tree");
        }
    }

    @Override
    public String toString() {
        return "Child: " + name + ", isHungry: " + isHungry + ".";
    }

}
