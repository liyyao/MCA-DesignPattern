package proxy.v1;

import java.util.Random;

/**
 * 问题：记录坦克移动时间
 */
public class Tank implements Movable {

    public static void main(String[] args) {
        new Tank().move();
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable {
    void move();
}