package proxy.v5;

import java.util.Random;

/**
 * 问题：记录坦克移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？耦合度太高
 * 使用代理模式
 * 代理的对象改成Movable类型，越来越像decorator了
 */
public class Tank implements Movable {

    public static void main(String[] args) {
        new TankTimeProxy(new TankLogProxy(new Tank())).move();
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
}

class TankTimeProxy implements Movable {
    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        System.out.println("stopped...");
    }
}

interface Movable {
    void move();
}