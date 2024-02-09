package lflr.arrays.stacks;


public interface ILinkedList<E> {
    int size();
    boolean isEmpty();
    Node<E> first();
    Node<E> last();
    void addFirst(E data);
    void addLast(E data);
    void removeFirst();
}
