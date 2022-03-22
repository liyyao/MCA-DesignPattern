package factory.abstractfactory;

public class MagicFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Food createFood() {
        return new Potato();
    }
}
