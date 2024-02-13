package lflr.arrays.queues;

import lflr.arrays.linkedlists.DoubleLinkedList;

public class Dequeue implements IDequeue{
    private DoubleLinkedList list;
    private int size;

    public Dequeue(){
        this.list = new DoubleLinkedList();
        this.size = 0;
    }
    @Override
    public void addFirst(int data) {
        list.addFirst(data);
        size++;
    }

    @Override
    public void addLast(int data) {
        list.addLast(data);
        size++;

    }

    @Override
    public int removeFirst() {
        if (isEmpty()){
            return 0;
        }else{
            int first = list.first().getData();
            list.removeFirst();
            size--;
            return first;
        }
    }

    @Override
    public int removeLast() {
        if (isEmpty()){
            return 0;
        }else{
            int last = list.last().getData();
            list.removeLast();
            size--;
            return last;
        }
    }

    @Override
    public int first() {
        if (isEmpty()){
            return 0;
        }
        return list.first().getData();
    }

    @Override
    public int last() {
        if (isEmpty()){
            return 0;
        }
        return list.last().getData();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return size;
    }

    public void print(){
        list.print();
    }
}
