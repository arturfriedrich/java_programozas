public class FruitTreeMain {

    public static void main(String[] args) {

        FruitTree tree = new FruitTree("Apple", 10);

        Child child1 = new Child("John", true);
        Child child2 = new Child("Mary", true);

        child1.eat(tree, 5);
        System.out.println(tree);
        System.out.println(child1);
        System.out.println(child2);

        child2.eat(tree, 3);
        System.out.println(tree);
        System.out.println(child1);
        System.out.println(child2);

    }

}
