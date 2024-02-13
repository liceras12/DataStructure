package lflr.arrays.stacks;

import lflr.arrays.linkedlists.LinkedList;

public class LinkedListStack<E> implements IStack<E> {

    private LinkedList list = new LinkedList();
    public int size = 0;
    private Node head;

    public LinkedListStack(){
        head = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(E data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;

    }

    @Override
    public E top() {
        if (head == null){
            return null;
        }
        return (E) head.data;
    }

    @Override
    public E pop() {
        if (head == null){
            return null;
        }
        E data = (E) head.data;
        head = head.next;
        size--;
        return data;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
