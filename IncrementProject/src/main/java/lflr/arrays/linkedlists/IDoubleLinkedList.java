package lflr.arrays.linkedlists;

public interface IDoubleLinkedList {
    /**
     * @return the number of elements in the list
     */
    int size();

    /**
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * @return the first element of the list
     */
    Node first();

    /**
     * @return the last element of the list
     */
    Node last();

    /**
     * @param data the element to be added to the list
     */
    void addFirst(int data);

    /**
     * @param data the element to be added to the list
     */
    void addLast(int data);

    /**
     * Remove the first element of the list
     */
    void removeFirst();

    /**
     * Remove the last element of the list
     */
    void removeLast();
}
