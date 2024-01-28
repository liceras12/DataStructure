package lflr.arrays;

public class LinkedListManager implements IManager {
    @Override
    public void run(){
        System.out.println("The linked list is running");
    }

    @Override
    public void printMenu() {
        System.out.println("LinkedList print menu");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Search");
    }
}
