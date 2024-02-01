package lflr.arrays.linkedlists;

public interface IDoubleLinkedList {
    int size();
    boolean isEmpty();
    Node first();
    Node last();
    void addFirst(int data);
    void addLast(int data);
    void removeFirst();
    void removeLast();
}
