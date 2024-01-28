package lflr.arrays;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.orderAdd(5);
        list.orderAdd(8);
        list.orderAdd(10);
        list.orderAdd(3);
        list.orderAdd(6);

        list.print();
    }
}
