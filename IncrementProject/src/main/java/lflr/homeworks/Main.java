package lflr.homeworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        System.out.println("Enter the number of disks");
        int numDiscs = inputValue();
        HanoiTower hanoiTower = new HanoiTower(numDiscs);
        hanoiTower.solve(numDiscs, 0, 2, 1);
        System.out.println("The number of movements is: " + hanoiTower.getMovement());
        */
        System.out.println("Enter the size of the array");
        int size = inputValue();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.addSize(size);
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter the value for the position " + i);
            array = bubbleSort.add(array, inputValue());
        }
        array = bubbleSort.bubbleSort(array);
        System.out.println("The sorted array is: ");
        bubbleSort.printArray(array);

    }

    public static int inputValue() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }
}
