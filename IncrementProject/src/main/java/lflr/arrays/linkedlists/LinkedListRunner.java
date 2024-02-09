package lflr.arrays.linkedlists;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class LinkedListRunner implements IRunner {
    private static final Scanner scannerText = new Scanner(System.in);
    private static final Scanner scannerNumber = new Scanner(System.in);
    public static int finish = 1;
    public static LinkedList list = new LinkedList();
    public static DoubleLinkedList doubleList = new DoubleLinkedList();
    @Override
    public void run() {
        System.out.println("Choose a Linked list type");
        System.out.println("A. Linked list");
        System.out.println("B. Double linked list");
        switch (inputOption()){
            case "A":
                while (finish != 0){
                    printMenu();
                    executeLinkedList();
                }
                break;
            case "B":
                while (finish != 0){
                    printMenuDouble();
                    executeDoubleLinkedList();
                }
                break;
            default:
                break;
        }
        /*
        list.addFirst(7);
        list.addFirst(12);
        list.addLast(13);
        list.removeFirst();
        list.addFirst(24);
        while (finish != 0){
            printMenu();
            executeLinkedList();
        }*/
    }

    public static void printMenu(){
        System.out.println("//////////////////////////////////////////");
        System.out.println("LinkedList is running");
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
        return scannerText.nextLine();
    }

    public static int inputValue() {
        System.out.println("Enter a value: ");
        return scannerNumber.nextInt();
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
                scannerText.close();
                scannerNumber.close();
                finish = 0;
                break;
            default:
                finish = 0;
                break;
        }
    }

    public static void printMenuDouble(){
        System.out.println("//////////////////////////////////////////");
        System.out.println("DoubleLinkedList is running");
        System.out.println("Choose a action");
        System.out.println("a. Print the linked list");
        System.out.println("b. Add a node at first");
        System.out.println("c. Add a node at last");
        System.out.println("d. Remove a node at first");
        System.out.println("e. Remove a node at last");
        System.out.println("f. See the size of the linked list");
        System.out.println("g. Linked list exit");
        System.out.println("//////////////////////////////////////////");
    }

    public static void executeDoubleLinkedList(){
        switch (inputOption()){
            case "a":
                doubleList.print();
                break;
            case "b":
                doubleList.addFirst(inputValue());
                doubleList.print();
                break;
            case "c":
                doubleList.addLast(inputValue());
                break;
            case "d":
                doubleList.removeFirst();
                break;
            case "e":
                doubleList.removeLast();
                break;
            case "f":
                System.out.println("linked list size is: " + doubleList.size());
                break;
            case "g":
                scannerText.close();
                scannerNumber.close();
                finish = 0;
                break;
            default:
                finish = 0;
                break;
        }
    }
}
