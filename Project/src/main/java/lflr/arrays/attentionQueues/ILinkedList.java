package lflr.arrays.attentionQueues;


public interface ILinkedList<F> {
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
    Node<F> first();

    /**
     * @return the last element of the list
     */
    Node<F> last();

    /**
     * @param data the element to be added to the list
     */
    void addFirst(F data);

    /**
     * @param data the element to be added to the list
     */
    void addLast(F data);

    /**
     * Remove the first element of the list
     */
    void removeFirst();
}
