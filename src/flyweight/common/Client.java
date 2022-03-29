package flyweight.common;

public class Client {

    public static void main(String[] args) {
        String key1 = "key1";
        String key2 = "key2";

        Flyweight flyweight = FlyweightFactory.getFlyweight(key1);
        Flyweight flyweight2 = FlyweightFactory.getFlyweight(key2);

        System.out.println(flyweight);
        System.out.println(flyweight2);
    }
}
