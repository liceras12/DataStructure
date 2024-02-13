package lflr.arrays.graph;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class GraphRunner implements IRunner {

    private static final Scanner scannerText = new Scanner(System.in);
    public int finish = 1;
    public static Graph graph = new Graph("Graph");

    @Override
    public void run() {
        System.out.println("Graph is running");
        System.out.println("A. Menu Graph");
        System.out.println("B. Exit to main menu");
        finish = 1;
        switch (inputOption()) {
            case "A":
                while (finish != 0) {
                    menu();
                    executeGraph();
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

    public void menu() {
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Add a node");
        System.out.println("b. Add an edge");
        System.out.println("c. Print the graph");
        System.out.println("d. Remove the graph");
        System.out.println("e. Get the number of nodes");
        System.out.println("f. Get the number of edges");
        System.out.println("g. Get the list of nodes");
        System.out.println("h. Get the list of edges");
        System.out.println("i. Graph exit");
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

    public void executeGraph() {
    }
}
