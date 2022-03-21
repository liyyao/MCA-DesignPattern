package singleton;

/**
 * 懒汉式
 * 使用时再初始化，但产生了线程安全问题
 */
public class LazyDemo01 {

    private static LazyDemo01 instance;

    private LazyDemo01(){}

    public static LazyDemo01 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazyDemo01();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(LazyDemo01.getInstance().hashCode());
            }).start();
        }
    }
}
