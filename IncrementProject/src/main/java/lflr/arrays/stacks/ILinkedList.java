package lflr.arrays.stacks;


public interface ILinkedList<E> {
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
    Node<E> first();

    /**
     * @return the last element of the list
     */
    Node<E> last();

    /**
     * @param data the element to be added to the list
     */
    void addFirst(E data);

    /**
     * @param data the element to be added to the list
     */
    void addLast(E data);

    /**
     * Remove the first element of the list
     */
    void removeFirst();
}
