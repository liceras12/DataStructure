package lflr.arrays;

public class LinkedList {

    Node head;

    public LinkedList(){
        this.head = null;
    }
    public void add(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }
        else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void orderAdd(int data){
        Node node = new Node(data);
        if ( head == null){
            head = node;
        }
        else{
            Node current = head;
            Node previous = null;
            while (current != null && current.data < data){
                previous = current;
                current = current.next;
            }
            if (previous == null){
                node.next = head;
                head = node;
            }
            else{
                previous.next = node;
                node.next = current;
            }
        }
    }
    public void print() {
        Node current = head;
        while (current != null){
            System.out.println((current.data));
            current = current.next;
        }
    }
}
