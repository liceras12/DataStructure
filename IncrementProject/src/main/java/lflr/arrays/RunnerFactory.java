package lflr.arrays;

import lflr.arrays.binarytrees.BinaryTreeRunner;
import lflr.arrays.interfaces.IRunner;
import lflr.arrays.linkedlists.LinkedListRunner;
import lflr.arrays.queues.QueueRunner;
import lflr.arrays.stacks.StackRunner;

public class RunnerFactory {
    public static IRunner getRunner(String structureID){
        switch (structureID){
            case "A":
                return new LinkedListRunner();
            case "B":
                return new StackRunner();
            case "C":
                return new QueueRunner();
            case "D":
                return new BinaryTreeRunner();
            case "G":
                System.exit(0);
                return null;
            default:
                return new NullRunner();
        }
    }
}
