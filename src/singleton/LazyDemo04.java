package singleton;

/**
 * 懒汉式
 * 使用时再初始化，但产生了线程安全问题
 * 双重检测（DCL: Double-checked locking），必须加关键字 volatile禁止指令重排
 */
public class LazyDemo04 {

    private static volatile LazyDemo04 instance;

    private LazyDemo04(){}

    public static LazyDemo04 getInstance() {
        if (instance == null) {
            synchronized (LazyDemo04.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new LazyDemo04();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                System.out.println(LazyDemo04.getInstance().hashCode());
            }).start();
        }
    }
}
