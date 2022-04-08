package template.common;

/**
 * 抽象模板中的基本方法尽量设计成protected类型
 */
public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public void templateMethod() {
        this.doAnything();
        this.doSomething();
    }
}
