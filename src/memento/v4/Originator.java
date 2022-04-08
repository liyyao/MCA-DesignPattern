package memento.v4;

/**
 * 在系统管理上，一个备份的数据是完全、绝对不能修改的，它保证数据的洁净，避免数据污染而使备份失去意义。
 * 使用内置类，并设置成private访问权限，这样除了发起人外，别人休想访问到
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public IMemento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(IMemento memento) {
        this.setState(((Memento)memento).getState());
    }

    private class Memento implements IMemento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
