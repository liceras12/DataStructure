package lflr.arrays.linkedlists;

public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public int getData(){
        return this.data;
    }
}
