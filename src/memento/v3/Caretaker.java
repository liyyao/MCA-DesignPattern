package memento.v3;

import java.util.HashMap;

/**
 * 备忘录管理员角色
 * 多备份的备忘录
 */
public class Caretaker {

    private HashMap<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String id) {
        return memMap.get(id);
    }

    public void setMemento(String id, Memento memento) {
        this.memMap.put(id, memento);
    }
}
