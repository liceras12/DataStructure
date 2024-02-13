package lflr.arrays.queues;

public interface IDequeue {
    /**
     * @param data the element to be added to the front of the queue
     */
    void addFirst(int data);

    /**
     * @param data the element to be added to the end of the queue
     */
    void addLast(int data);

    /**
     * @return the first element of the queue and remove it from the queue
     */
    int removeFirst();

    /**
     * @return the last element of the queue and remove it from the queue
     */
    int removeLast();

    /**
     * @return the first element of the queue
     */
    int first();

    /**
     * @return the last element of the queue
     */
    int last();

    /**
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * @return the number of elements in the queue
     */
    int size();
}
