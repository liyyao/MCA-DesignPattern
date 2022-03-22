package factory;

import factory.abstractfactory.Car;

public class Main {

    public static void main(String[] args) {
        /*Car c = new Car();
        c.go();*/

        /*Moveable m = new Plane();
        m.go();*/

        SimpleVehicleFactory f = new SimpleVehicleFactory();
        Car car = f.createCar();
        car.go();
    }
}
