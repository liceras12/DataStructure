package lflr.arrays.linkedlists;

public interface ILinkedList {
    /**
     * @return the number of elements in the list
     */
    int size();

    /**
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * @return the first element in the list
     */
    Node first();

    /**
     * @return the last element in the list
     */
    Node last();

    /**
     * @param data the data to be added to the list
     */
    void addFirst(int data);

    /**
     * @param data the data to be added to the list
     */
    void addLast(int data);

    /**
     * Removes the first element in the list
     */
    void removeFirst();
}
