package lflr.arrays.queues;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class QueueRunner implements IRunner {
    private static final Scanner scannerText = new Scanner(System.in);
    public int finish = 1;
    public static LinkedListQueue list = new LinkedListQueue();
    public static Dequeue dequeue = new Dequeue();

    @Override
    public void run() {
        System.out.println("LinkedListQueue is running");
        System.out.println("A. Menu LinkedListQueue");
        System.out.println("B. Menu Dequeue");
        System.out.println("C. Exit to main menu");
        finish = 1;
        switch (inputOption()) {
            case "A":
                while (finish != 0) {
                    menu();
                    executeLinkedListQueue();
                }
                break;
            case "B":
                while (finish != 0) {
                    menuDequeue();
                    executeDequeue();
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

    public void menu() {
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Print the queue");
        System.out.println("b. Add a data at queue end");
        System.out.println("c. Remove a data at queue front");
        System.out.println("d. See the size of the queue");
        System.out.println("e. See the front of the queue");
        System.out.println("f. Queue exit");
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

    public void executeLinkedListQueue() {
        switch (inputOption()) {
            case "a":
                if (list.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    list.print();
                }
                break;
            case "b":
                list.enqueue(inputValue());
                break;
            case "c":
                if (list.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The data removed is: " + list.dequeue());
                }
                break;
            case "d":
                System.out.println("The size of the queue is: " + list.size());
                break;
            case "e":
                if (list.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The front of the queue is: " + list.first());
                }
                break;
            case "f":
                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public void menuDequeue(){
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Print the queue");
        System.out.println("b. Add a data at queue front");
        System.out.println("c. Add a data at queue end");
        System.out.println("d. Remove a data at queue front");
        System.out.println("e. Remove a data at queue end");
        System.out.println("f. See the front of the queue");
        System.out.println("g. See the end of the queue");
        System.out.println("h. See the size of the queue");
        System.out.println("i. Queue exit");
        System.out.println("//////////////////////////////////////////");
    }

    public void executeDequeue() {
        switch (inputOption()) {
            case "a":
                if (dequeue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    dequeue.print();
                }
                break;
            case "b":
                dequeue.addFirst(inputValue());
                break;
            case "c":
                dequeue.addLast(inputValue());
                break;
            case "d":
                if (dequeue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The data removed is: " + dequeue.removeFirst());
                }
                break;
            case "e":
                if (dequeue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The data removed is: " + dequeue.removeLast());
                }
                break;
            case "f":
                if (dequeue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The front of the queue is: " + dequeue.first());
                }
                break;
            case "g":
                if (dequeue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The end of the queue is: " + dequeue.last());
                }
                break;
            case "h":
                System.out.println("The size of the queue is: " + dequeue.size());
                break;
            case "i":
                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}