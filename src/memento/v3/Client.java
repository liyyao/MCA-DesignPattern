package memento.v3;

public class Client {

    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setState1("I");
        ori.setState2("love");
        ori.setState3("U");
        System.out.println("==初始化状态==");
        System.out.println(ori);

        caretaker.setMemento("001", ori.createMemento());

        ori.setState1("U");
        ori.setState2("hate");
        ori.setState3("me");
        System.out.println("==修改后状态==");
        System.out.println(ori);

        caretaker.setMemento("002", ori.createMemento());

        ori.restoreMemento(caretaker.getMemento("001"));
        System.out.println("==恢复后状态==");
        System.out.println(ori);

        ori.restoreMemento(caretaker.getMemento("002"));
        System.out.println("==恢复后状态==");
        System.out.println(ori);
    }
}
