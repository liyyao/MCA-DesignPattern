package factory.abstractfactory;

public class Main {

    public static void main(String[] args) {
        /*Car c = new Car();
        c.go();

        AK47 w = new AK47();
        w.shoot();

        Bread b = new Bread();
        b.printName();*/

        /*Vehicle v = new Car();
        v.go();

        Weapon w = new AK47();
        w.shoot();

        Food f = new Bread();
        f.printName();

        System.out.println("=============");

        Vehicle v2 = new Broom();
        v2.go();

        Weapon w2 = new MagicStick();
        w2.shoot();

        Food f2 = new Potato();
        f2.printName();*/

        //AbstractFactory a = new ModernFactory();
        AbstractFactory a = new MagicFactory();
        Vehicle vehicle = a.createVehicle();
        vehicle.go();

        Weapon weapon = a.createWeapon();
        weapon.shoot();

        Food food = a.createFood();
        food.printName();
    }
}
