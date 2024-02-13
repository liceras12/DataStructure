package lflr.arrays.stacks;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class StackRunner implements IRunner {

    private static final Scanner scannerText = new Scanner(System.in);
    private static final Scanner scannerNumber = new Scanner(System.in);
    public static int finish = 1;
    public static LinkedListStack list = new LinkedListStack();
    public void run(){
        System.out.println("LinkedListStack is running");
        System.out.println("A. Menu LinkedListStack");
        System.out.println("B. Exit to main menu");
        finish = 1;
        switch (inputOption()){
            case "A":
                while (finish != 0){
                    menu();
                    executeLinkedListStack();
                }
                break;
            case "B":
                Main.main(null);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public void menu(){
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Print the stack");
        System.out.println("b. Add a data at stack top");
        System.out.println("c. Remove a data at stack top");
        System.out.println("d. See the size of the stack");
        System.out.println("e. See the top of the stack");
        System.out.println("f. Stack exit");
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

    public void executeLinkedListStack(){
        switch (inputOption()){
            case "a":
                if (list.isEmpty()){
                    System.out.println("The stack is empty");
                } else {
                    list.print();
                }
                break;
            case "b":
                list.push(inputValue());
                break;
            case "c":
                if (list.isEmpty()){
                    System.out.println("The stack is empty");
                } else {
                    list.pop();
                }
                break;
            case "d":
                System.out.println("the size is: " + list.size());
                break;
            case "e":
                if (list.isEmpty()){
                    System.out.println("The stack is empty");
                } else {
                    System.out.println("The top is: " + list.top());
                }
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

}
