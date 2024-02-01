package lflr.arrays.linkedlists;

public class DoubleLinkedList implements IDoubleLinkedList{
    Node head;
    Node tail;
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        Node current = head;
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
    public Node first() {
        return head;
    }

    @Override
    public Node last() {
        return tail;
    }

    @Override
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    @Override
    public void addLast(int data) {
        Node newNode = new Node(data);
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
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
