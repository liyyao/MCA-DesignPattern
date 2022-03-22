package decorator.common;

/**
 * 抽象装饰者
 * 如果只有一个装饰类，可以没有抽象装饰角色
 */
public abstract class Decorator extends Component {

    private Component component = null;

    //通过构造函数传递被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    //委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
