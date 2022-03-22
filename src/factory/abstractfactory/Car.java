package factory.abstractfactory;

import factory.Moveable;

public class Car extends Vehicle {

    @Override
    public void go() {
        System.out.println("Car go wuwuwu......");
    }
}
