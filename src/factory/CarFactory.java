package factory;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car create...");
        return new Car();
    }
}
