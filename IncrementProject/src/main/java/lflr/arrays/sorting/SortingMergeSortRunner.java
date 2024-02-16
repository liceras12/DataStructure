package lflr.arrays.sorting;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Scanner;

public class SortingMergeSortRunner implements IRunner {
    private static final Scanner scannerText = new Scanner(System.in);
    public int finish = 1;
    public static SortingMergeSort sortingMergeSort = new SortingMergeSort();
    @Override
    public void run() {
        System.out.println("Add the size of the array: ");
        int size = inputValue();
        sortingMergeSort.addSize(size);
        int[] array = new int[size];
        while (finish != 0) {
            Menu();
            switch (inputOption()) {
                case "a":
                    for (int i = 0; i < size; i++){
                        System.out.println("Enter the value for the position " + i);
                        array = sortingMergeSort.add(array, inputValue());
                    }
                    break;
                case "b":
                    array = sortingMergeSort.mergeSort(array);
                    break;
                case "c":
                    sortingMergeSort.printArray(array);
                    break;
                case "d":
                    finish = 0;
                    break;
                case "e":
                    Main.main(null);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

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

    public void Menu() {
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Add a value to the array");
        System.out.println("b. Merge sort the array");
        System.out.println("c. Print the array");
        System.out.println("d. Array exit");
        System.out.println("e. Exit to main menu");
        System.out.println("//////////////////////////////////////////");
    }
}
