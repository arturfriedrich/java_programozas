public class Soldier {

    private String name;
    private int damage;
    private int health;

    public Soldier(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void getsHit(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
            System.out.println(this.name + " got hit, health: " + this.health);
        } else {
            this.health = 0;
            System.out.println(this.name + " died.");
        }
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", damage: " + damage + ", health: " + health;
    }

}
