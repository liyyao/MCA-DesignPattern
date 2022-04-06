package iterator.v5;

public class LinkedList_<E> implements Collection_<E> {

    Node head = null;
    Node tail = null;

    private int size = 0;

    public void add(E o) {
        Node n = new Node(o);
        n.next = null;
        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        private E o;
        Node next;

        public Node(E o) {
            this.o = o;
        }
    }

    @Override
    public Iterator_<E> iterator() {
        return null;
    }
}
