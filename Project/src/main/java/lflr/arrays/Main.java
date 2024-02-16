package lflr.arrays;


import java.util.Scanner;

public class Main {

    private static Scanner scannerText = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
        String option = inputOption();
        int finish = 1;
        while (finish != 0){
            IManager manager = ManagerFactory.getManager(option);
            manager.run();
        }
    }

    public static void printMenu(){
        System.out.println("Choose a data structure");
        System.out.println("A. Menu Attention");
        System.out.println("B. Exit to application");
    }

    public static String inputOption() {
        System.out.println("Enter your choice: ");
        return scannerText.nextLine();
    }
}