package lflr.arrays;

import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        printMenu();
        String selection = inputStructure();
        int finish = 1;
        while (finish != 0){
            IRunner runner = RunnerFactory.getRunner(selection);
            runner.run();
        }
    }
    public static void printMenu(){
        System.out.println("Choose a data structure");
        System.out.println("A. Linked List");
        System.out.println("B. Stack");
        System.out.println("C. Queue");
        System.out.println("D. Binary Tree");
        System.out.println("E. Graph");
        System.out.println("F. Sorting");
        System.out.println("G. Exit to application");
    }

    public static String inputStructure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        String structure = scanner.nextLine();
        return structure;
    }
}
