package singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用到与否，类装载时就完成实例化
 */
public class EagerDemo01 {

    private static final EagerDemo01 EAGER_DEMO = new EagerDemo01();

    private EagerDemo01(){}

    public static EagerDemo01 getInstance() {
        return EAGER_DEMO;
    }

    public static void main(String[] args) {
        EagerDemo01 eagerDemo01 = EagerDemo01.getInstance();
        EagerDemo01 eagerDemo02 = EagerDemo01.getInstance();
        System.out.println(eagerDemo01 == eagerDemo02);
    }
}
