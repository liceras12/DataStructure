package lflr.arrays;

import lflr.arrays.interfaces.IRunner;
import lflr.arrays.linkedlists.LinkedListRunner;

import java.util.Queue;

public class RunnerFactory {
    public static IRunner getRunner(String structureID){
        switch (structureID){
            case "A":
                return new LinkedListRunner();
            /*case "B":
                return new StackRunner();
            case "C":
                return new QueueRunner();*/
            default:
                return new NullRunner();
        }
    }
}
