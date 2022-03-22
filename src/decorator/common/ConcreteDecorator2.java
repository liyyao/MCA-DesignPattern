package decorator.common;

/**
 * 具体的装饰类
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("method2 修饰");
    }

    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
