package lflr.arrays.attentionQueues;

public class Node<F> {
    F data;
    Node<F> next;

    public Node(F data){
        this.data = data;
        this.next = null;
    }
}
