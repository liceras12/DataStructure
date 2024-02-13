package lflr.arrays.linkedlists;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class LinkedListRunner implements IRunner {
    private static final Scanner scannerText = new Scanner(System.in);
    private static final Scanner scannerNumber = new Scanner(System.in);
    public static LinkedList list = new LinkedList();
    public static DoubleLinkedList doubleList = new DoubleLinkedList();
    public static int finish = 1;
    @Override
    public void run() {
        System.out.println("Choose a Linked list type");
        System.out.println("A. Linked list");
        System.out.println("B. Double linked list");
        System.out.println("C. Exit to main menu");
        finish = 1;

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
            case "C":
                Main.main(null);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
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
        System.out.println("f. Exit to linked list menu");
        System.out.println("//////////////////////////////////////////");
    }

    public static String inputOption() {
        System.out.println("Enter your choice: ");
        return scannerText.nextLine();
    }

    public static int inputValue() {
        System.out.println("Enter a value: ");
        String value = scannerText.nextLine();
        try {
            Integer.parseInt(value);
            int valueInt = Integer.parseInt(value);
            return valueInt;
        } catch (NumberFormatException exception) {
            System.out.println("Is not a integer number, try again");
            return inputValue();
        }
    }

    public static void executeLinkedList(){
        switch (inputOption()){
            case "a":
                if (list.isEmpty()){
                    System.out.println("The linked list is empty");
                } else {
                    list.print();
                }
                break;
            case "b":
                list.addFirst(inputValue());
                list.print();
                break;
            case "c":
                list.addLast(inputValue());
                break;
            case "d":
                if (list.isEmpty()){
                    System.out.println("The linked list is empty");
                } else {
                    list.removeFirst();
                }
                break;
            case "e":
                System.out.println("linked list size is: " + list.size());
                break;
            case "f":
                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
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
        System.out.println("g. Exit to linked list menu");
        System.out.println("//////////////////////////////////////////");
    }

    public static void executeDoubleLinkedList(){
        switch (inputOption()){
            case "a":
                if (doubleList.isEmpty()){
                    System.out.println("The double linked list is empty");
                } else {
                    doubleList.print();
                }
                break;
            case "b":
                doubleList.addFirst(inputValue());
                doubleList.print();
                break;
            case "c":
                doubleList.addLast(inputValue());
                break;
            case "d":
                if (doubleList.isEmpty()){
                    System.out.println("The double linked list is empty");
                } else {
                    doubleList.removeFirst();
                }
                break;
            case "e":
                if (doubleList.isEmpty()){
                    System.out.println("The double linked list is empty");
                } else {
                    doubleList.removeLast();
                }
                break;
            case "f":
                System.out.println("linked list size is: " + doubleList.size());
                break;
            case "g":

                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
                finish = 0;
                break;
        }
    }
}
