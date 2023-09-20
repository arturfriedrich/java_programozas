public class CorporateMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Adél", 200000);
        System.out.println(employee.toString());

        Boss boss = new Boss("Feri", 300000, 50000);
        System.out.println(boss.toString());

        CEO ceo = new CEO("Imre", 500000, 50000, "BMW");
        System.out.println(ceo.toString());

    }

}
