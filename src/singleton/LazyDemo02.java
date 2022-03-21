package singleton;

/**
 * 懒汉式
 * 使用时再初始化，但产生了线程安全问题
 * 可以通过添加synchronized来解决，但效率下降了
 */
public class LazyDemo02 {

    private static LazyDemo02 instance;

    private LazyDemo02(){}

    public static synchronized LazyDemo02 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazyDemo02();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(LazyDemo02.getInstance().hashCode());
            }).start();
        }
    }
}
