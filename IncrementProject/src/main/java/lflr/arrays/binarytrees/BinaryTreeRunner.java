package lflr.arrays.binarytrees;

import lflr.arrays.Main;
import lflr.arrays.interfaces.IRunner;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTreeRunner implements IRunner {
    private static final Scanner scannerText = new Scanner(System.in);
    public int finish = 1;
    public static BinaryTree binaryTree = new BinaryTree();

    @Override
    public void run() {
        System.out.println("Binary Tree is running");
        System.out.println("A. Menu Binary Tree");
        System.out.println("B. Exit to main menu");
        finish = 1;
        switch (inputOption()) {
            case "A":
                while (finish != 0) {
                    menu();
                    executeBinaryTree();
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
        System.out.println("a. Insert a data");
        System.out.println("b. Search a data");
        System.out.println("c. Delete a data");
        System.out.println("d. Print the tree");
        System.out.println("e. Print the in-order traversal of the tree");
        System.out.println("f. Print the pre-order traversal of the tree");
        System.out.println("g. Print the post-order traversal of the tree");
        System.out.println("h. Print the height of the tree");
        System.out.println("i. Print the size of the tree");
        System.out.println("j. Exit");
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

    public void executeBinaryTree(){
        switch (inputOption()) {
            case "a":
                binaryTree.insert(inputValue());
                break;
            case "b":
                System.out.println(binaryTree.search(inputValue()));
                break;
            case "c":
                if(binaryTree.search(inputValue())){
                    binaryTree.delete(inputValue());
                } else {
                    System.out.println("The data is not in the tree");
                }
                break;
            case "d":
                binaryTree.print();
                break;
            case "e":
                if(binaryTree.size() == 0){
                    System.out.println("The tree is empty");
                } else {
                    System.out.println(Arrays.toString(binaryTree.inOrder()));
                }
                break;
            case "f":
                if (binaryTree.size() == 0){
                    System.out.println("The tree is empty");
                } else {
                    System.out.println(Arrays.toString(binaryTree.preOrder()));
                    //System.out.println(binaryTree.preOrder());
                }
                break;
            case "g":
                if (binaryTree.size() == 0){
                    System.out.println("The tree is empty");
                } else {
                    System.out.println(Arrays.toString(binaryTree.postOrder()));
                    //System.out.println(binaryTree.postOrder());
                }
                break;
            case "h":
                if (binaryTree.size() == 0){
                    System.out.println("The tree is empty");
                } else {
                    System.out.println("The height of tree is: " + binaryTree.height());
                }
                break;
            case "i":
                System.out.println("The size of tree is: " + binaryTree.size());
                break;
            case "j":
                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
