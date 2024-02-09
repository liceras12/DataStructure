package lflr.arrays.queues;

public interface IQueue {
    void enqueue(int value);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();
    void print();
    int size();
    int capacity();
}
