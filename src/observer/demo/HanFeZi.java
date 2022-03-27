package observer.demo;

import java.util.Observable;

/**
 * 实现java中自带的被观察者
 */
public class HanFeZi extends Observable {
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭...");
    }
}
