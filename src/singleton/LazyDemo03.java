package singleton;

/**
 * 懒汉式
 * 使用时再初始化，但产生了线程安全问题
 * 试图通过减小synchronized代码块来提交效率，但是不可行
 */
public class LazyDemo03 {

    private static LazyDemo03 instance;

    private LazyDemo03(){}

    public static LazyDemo03 getInstance() {
        if (instance == null) {
            synchronized (LazyDemo03.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new LazyDemo03();
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(LazyDemo03.getInstance().hashCode());
            }).start();
        }
    }
}
