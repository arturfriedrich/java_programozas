public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(int amount) {
        this.salary += amount;
    }

    public String toString() {
        return "Alkalmazott neve: " + this.name + ", fizetése: " + this.salary + " Ft.";
    }

}
