public class Boss  extends Employee{

    private int bonus;

    public Boss(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void raiseSalary(int amount) {
        super.raiseSalary(amount);
        this.bonus += amount;
    }

    public String toString() {
        return super.toString() + " + " + this.bonus + " Ft bónusz.";
    }

}
