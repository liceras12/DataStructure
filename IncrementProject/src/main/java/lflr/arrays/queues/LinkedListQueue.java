package lflr.arrays.queues;

public class LinkedListQueue<F> implements IQueue<F>{
    Node head;
    private LinkedList list;
    private int size;

    public LinkedListQueue(){
        list = new LinkedList();
        size = 0;
    }

    @Override
    public void enqueue(F data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public F dequeue() {
        if (isEmpty()){
            return null;
        }
        F data = (F) head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public F first() {
        if (isEmpty()){
            return null;
        }
        return (F) head.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
