package observer.v2;

/**
 * 面向对象的傻等
 */
public class Main2 {

    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }

}

class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wuwuwuwu...");
        cry = true;
    }
}