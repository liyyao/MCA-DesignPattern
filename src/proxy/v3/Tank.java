package proxy.v3;

import java.util.Random;

/**
 * 问题：记录坦克移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？耦合度太高
 * 使用代理模式
 */
public class Tank implements Movable {

    public static void main(String[] args) {
        new TankTimeProxy(new Tank()).move();
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
    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable {
    void move();
}