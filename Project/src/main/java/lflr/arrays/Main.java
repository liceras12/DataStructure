package lflr.arrays;

public class Main {
    public static void main(String[] args) {
        printMenu();

        //take user input
        IManager manager = ManagerFactory.getManager(1);
        manager.printMenu();
        manager.run();
    }

    public static void printMenu(){
        System.out.println("Welcome");
        System.out.println("1. LinkedList");
        System.out.println("2. Stacks");
        System.out.println("3. Queues");
        System.out.println("4. Trees");
        System.out.println("5. Graphs");
        System.out.println("6. 1 Sorting");
        System.out.println("7. 2 Sorting");
        System.out.println("8. 3 Sorting");
    }
}