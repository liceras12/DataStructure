package lflr.arrays.linkedlists;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class LinkedListRunner implements IRunner {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Scanner scanner2 = new Scanner(System.in);
    public static int finish = 1;
    public static LinkedList list = new LinkedList();
    @Override
    public void run() {
        System.out.println("LinkedList is running");
        list.addFirst(7);
        list.addFirst(12);
        list.addLast(13);
        list.removeFirst();
        list.addFirst(24);
        while (finish != 0){
            printMenu();
            executeLinkedList();
        }
    }

    public static void printMenu(){
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Print the linked list");
        System.out.println("b. Add a node at first");
        System.out.println("c. Add a node at last");
        System.out.println("d. Remove a node at first");
        System.out.println("e. See the size of the linked list");
        System.out.println("f. Linked list exit");
        System.out.println("//////////////////////////////////////////");
    }

    public static String inputOption() {
        System.out.println("Enter your choice: ");
        return scanner.nextLine();
    }

    public static int inputValue() {
        System.out.println("Enter a value: ");
        return scanner2.nextInt();
    }

    public static void executeLinkedList(){
        switch (inputOption()){
            case "a":
                list.print();
                break;
            case "b":
                list.addFirst(inputValue());
                list.print();
                break;
            case "c":
                list.addLast(inputValue());
                break;
            case "d":
                list.removeFirst();
                break;
            case "e":
                System.out.println("linked list size is: " + list.size());
                break;
            case "f":
                scanner.close();
                scanner2.close();
                finish = 0;
                break;
            default:
                finish = 0;
                break;
        }
    }
}
