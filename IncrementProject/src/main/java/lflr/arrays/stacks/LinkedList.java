package lflr.arrays.stacks;

public class LinkedList<E> implements ILinkedList<E> {

    Node<E> head;

    /**
     * @return
     */
    @Override
    public int size() {
        if (isEmpty()){
            return 0;
        }
        int size = 0;
        Node<E> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    /**
     * @return
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * @return
     */
    @Override
    public Node<E> first() {
        return head;
    }

    /**
     * @return
     */
    @Override
    public Node<E> last() {
        Node<E> current  = head;
        while (current != null){
            if (current.next == null){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * @param data
     */
    @Override
    public void addFirst(E data) {
        Node<E> newNode = new Node<E>(data);
        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * @param data
     */
    @Override
    public void addLast(E data) {
        if (last() == null){
            addFirst(data);
        }
        Node<E> lastNode = last();
        lastNode.next = new Node<E>(data);
    }

    /**
     *
     */
    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        head = head.next;
    }

    public void print(){
        Node<E> current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
