package lflr.arrays.attentionQueues;

public interface IDequeue<T> {
    /**
     * @param data the element to be added to the front of the queue
     */
    void addFirst(T data);

    /**
     * @param data the element to be added to the end of the queue
     */
    void addLast(T data);

    /**
     * @return the first element of the queue and remove it from the queue
     */
    T removeFirst();

    /**
     * @return the last element of the queue and remove it from the queue
     */
    T removeLast();

    /**
     * @return the first element of the queue
     */
    T first();

    /**
     * @return the last element of the queue
     */
    T last();

    /**
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * @return the number of elements in the queue
     */
    int size();
}
