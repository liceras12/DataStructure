package lflr.arrays.queues;

public class LinkedList<F> implements ILinkedList<F> {

    Node<F> head;

    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        Node<F> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Node<F> first() {
        return head;
    }

    @Override
    public Node<F> last() {
        Node<F> current  = head;
        while (current != null){
            if (current.next == null){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void addFirst(F data) {
        Node<F> newNode = new Node<F>(data);
        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(F data) {
        if (last() == null){
            addFirst(data);
        }
        Node<F> lastNode = last();
        lastNode.next = new Node<F>(data);
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        head = head.next;
    }

    public void print(){
        Node<F> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
