package decorator.common;

public class Client02 {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operate();
    }
}
