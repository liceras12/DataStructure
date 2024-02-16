package lflr.arrays.attentionQueues;

public interface IDoubleLinkedList<T> {
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
    NodeDouble<T> first();

    /**
     * @return the last element of the list
     */
    NodeDouble<T> last();

    /**
     * @param data the element to be added to the list
     */
    void addFirst(T data);

    /**
     * @param data the element to be added to the list
     */
    void addLast(T data);

    /**
     * Remove the first element of the list
     */
    void removeFirst();

    /**
     * Remove the last element of the list
     */
    void removeLast();
}
