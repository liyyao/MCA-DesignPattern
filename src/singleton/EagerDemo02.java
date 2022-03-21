package singleton;

/**
 * 和EagerDemo01是一个意思
 */
public class EagerDemo02 {

    private static final EagerDemo02 instance;

    static {
        instance = new EagerDemo02();
    }

    private EagerDemo02(){}

    public static EagerDemo02 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerDemo02 eagerDemo01 = EagerDemo02.getInstance();
        EagerDemo02 eagerDemo02 = EagerDemo02.getInstance();
        System.out.println(eagerDemo01 == eagerDemo02);
    }
}
