package lflr.arrays.attentionQueues;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T> {
    NodeDouble<T> head;
    NodeDouble<T> tail;
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        NodeDouble<T> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public NodeDouble<T> first() {
        return head;
    }

    @Override
    public NodeDouble<T> last() {
        return tail;
    }

    @Override
    public void addFirst(T data) {
        NodeDouble<T> newNode = new NodeDouble<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    @Override
    public void addLast(T data) {
        NodeDouble<T> newNode = new NodeDouble<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double Linked List is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
    }

    @Override
    public void removeLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
            tail = null;
        }
    }
    public void print(){
        NodeDouble current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
