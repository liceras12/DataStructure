package lflr.arrays.queues;

public interface IQueue<E> {
    /**
     * @param data the element to be added to the queue
     */
    void enqueue(E data);

    /**
     * @return the first element of the queue and remove it from the queue
     */
    E dequeue();

    /**
     * @return the first element of the queue
     */
    E first();

    /**
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * @return the number of elements in the queue
     */
    int size();
}
