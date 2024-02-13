package lflr.arrays.queues;

public class NodeDouble {
    int data;
    NodeDouble next;
    NodeDouble prev;

    public NodeDouble(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public int getData(){
        return this.data;
    }
}
