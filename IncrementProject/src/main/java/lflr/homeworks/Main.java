package lflr.homeworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of disks");
        int numDiscs = inputValue();
        HanoiTower hanoiTower = new HanoiTower(numDiscs);
        hanoiTower.solve(numDiscs, 0, 2, 1);
        System.out.println("The number of movements is: " + hanoiTower.getMovement());
    }

    public static int inputValue() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }
}
