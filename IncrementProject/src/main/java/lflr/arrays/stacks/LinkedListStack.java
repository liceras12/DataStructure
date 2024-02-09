package lflr.arrays.stacks;

import lflr.arrays.linkedlists.LinkedList;

public class LinkedListStack<E> implements IStack<E> {

    private LinkedList list = new LinkedList();
    Node<E> head;

    public LinkedListStack(){
        head = null;
    }

    /**
     * @return
     */
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        Node<E> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * @param data
     */
    @Override
    public void push(E data) {

    }

    /**
     * @return
     */
    @Override
    public E top() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public E pop() {
        return null;
    }
}
