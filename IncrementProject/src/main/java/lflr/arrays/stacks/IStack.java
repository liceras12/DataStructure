package lflr.arrays.stacks;

public interface IStack<E> {
    /**
     * @return the number of elements in the stack
     */
    int size();

    /**
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * @param data the element to be added to the stack
     */
    void push(E data);

    /**
     * @return the top element of the stack
     */
    E top();

    /**
     * @return the top element of the stack and remove it from the stack
     */
    E pop();
}
