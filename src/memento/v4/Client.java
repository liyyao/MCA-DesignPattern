package memento.v4;

/**
 * 场景类
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("2132");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        System.out.println(originator);
        originator.setState("11111111");
        System.out.println(originator);
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator);
    }
}
