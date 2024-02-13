package lflr.arrays.queues;

import lflr.arrays.linkedlists.Node;

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
    NodeDouble first();

    /**
     * @return the last element of the list
     */
    NodeDouble last();

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
