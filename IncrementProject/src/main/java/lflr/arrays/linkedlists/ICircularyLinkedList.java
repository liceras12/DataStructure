package lflr.arrays.linkedlists;

public interface ICircularyLinkedList {
    int size();
    boolean isEmpty();
    Node first();
    Node last();
    void addFirst(int data);
    void addLast(int data);
    void removeFirst();
}
