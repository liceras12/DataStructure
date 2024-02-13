package lflr.arrays.queues;

public class Node<F> {
    F data;
    Node<F> next;

    public Node(F data){
        this.data = data;
        this.next = null;
    }
}
