package observer.common;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收信息，进行处理！");
    }
}
