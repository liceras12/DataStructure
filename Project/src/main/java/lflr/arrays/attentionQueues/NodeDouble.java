package lflr.arrays.attentionQueues;

public class NodeDouble<T> extends Node<T>{
    T data;
    NodeDouble<T> next;
    NodeDouble<T> prev;

    public NodeDouble(T data){
        super(data);
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
