package observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 加入多个观察者
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "local");
        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }
}

class WakeUpEvent {
    long timestamp;
    String loc;

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent event);
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        if ("bed".equals(event.loc)) {
            feed();
        }
    }
}

class Mum implements Observer {
    public void hug() {
        System.out.println("mum hug...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        wang();
    }
}
