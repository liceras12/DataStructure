package lflr.arrays.attentionQueues;

public class EmergencyQueue<T> implements IDequeue<T>{
    private DoubleLinkedList list;
    private int size;

    public EmergencyQueue(){
        this.list = new DoubleLinkedList();
        this.size = 0;
    }
    @Override
    public void addFirst(T data) {
        list.addFirst(data);
        size++;
    }

    @Override
    public void addLast(T data) {
        list.addLast(data);
        size++;

    }

    @Override
    public T removeFirst() {
        if (isEmpty()){
            return null;
        }else{
            T first = (T) list.first();
            list.removeFirst();
            size--;
            return first;
        }
    }

    @Override
    public T removeLast() {
        if (isEmpty()){
            return null;
        }else{
            NodeDouble<T> last = list.last();
            list.removeLast();
            size--;
            return (T) last;
        }
    }

    @Override
    public T first() {
        if (isEmpty()){
            return null;
        }
        return (T) list.first().data;
    }

    @Override
    public T last() {
        if (isEmpty()){
            return null;
        }
        return (T) list.last().data;
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
