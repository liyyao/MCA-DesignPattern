package singleton;

/**
 * 使用枚举类，不仅可以解决线程安全问题，还可以防止反序列化
 */
public enum UseEnumDemo {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(LazyDemo04.getInstance().hashCode());
            }).start();
        }
    }
}
