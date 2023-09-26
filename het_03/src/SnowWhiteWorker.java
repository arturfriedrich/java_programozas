public class SnowWhiteWorker {

    private String name;
    private int age;
    private String position;
    private int salary;

    public SnowWhiteWorker(String name, int age, String position, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return this.position;
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
        return "Név: " + this.name + ", életkor: " + this.age + ", pozíció: " + this.position + ", fizetés: " + this.salary + " arany.";
    }

}
