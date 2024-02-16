package lflr.arrays.attentionQueues;

public interface IQueue<E> {
    /**
     * @param data the entrance to the queue
     */
    void enqueue(E data);

    /**
     * examine the entrance and delegate or remove it
     */
    void attend();

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
