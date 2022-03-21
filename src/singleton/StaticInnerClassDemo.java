package singleton;

/**
 * 静态内部类
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现情懒加载
 */
public class StaticInnerClassDemo {
    private StaticInnerClassDemo(){}

    private static class InnerStaticClass {
        private static final StaticInnerClassDemo instance = new StaticInnerClassDemo();
    }

    public static StaticInnerClassDemo getInstance() {
        return InnerStaticClass.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(LazyDemo04.getInstance().hashCode());
            }).start();
        }
    }
}
