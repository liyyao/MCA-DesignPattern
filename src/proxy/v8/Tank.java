package proxy.v8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 问题：记录坦克移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？耦合度太高
 * 使用代理模式
 * 代理的对象改成Movable类型，越来越像decorator了
 * 如果有stop方法需要代理...
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型
 * （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 * 分离代理行为与被代理对象
 * 使用jdk的动态代理
 * jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 */
public class Tank implements Movable {

    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[] {Movable.class},
                new TimeProxy(tank));
        m.move();
    }

    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("=======");
    }
}

class TimeProxy implements InvocationHandler {

    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before() {
        System.out.println("method start...");
    }

    public void after() {
        System.out.println("method stop...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }
}

interface Movable {
    void move();

    void print();
}