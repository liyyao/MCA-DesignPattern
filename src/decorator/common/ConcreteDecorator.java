package decorator.common;

public class ConcreteDecorator extends Component {

    private Component component = null;

    public ConcreteDecorator(Component component) {
        this.component = component;
    }

    public void method() {
        System.out.println("method 修饰");
    }

    @Override
    public void operate() {
        this.method();
        this.component.operate();
    }
}
