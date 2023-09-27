public class TankMain {

    public static void main(String[] args) {
        Tank tank = new Tank("Tigris", 100, 1000);
        Soldier soldier = new Soldier("Béla", 10, 120);

        System.out.println(tank);
        System.out.println(soldier);

        tank.shoot(soldier);
        tank.shoot(soldier);

        System.out.println(tank);
        System.out.println(soldier);
    }

}
