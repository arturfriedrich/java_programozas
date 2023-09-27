public class Tank {

    private String type;
    private int damage;
    private int armor;

    public Tank(String type, int damage, int armor) {
        this.type = type;
        this.damage = damage;
        this.armor = armor;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void shoot(Soldier soldier) {
        soldier.getsHit(this.damage);
    }

    @Override
    public String toString() {
        return "Type: " + type + ", damage: " + damage + ", armor: " + armor;
    }

}
