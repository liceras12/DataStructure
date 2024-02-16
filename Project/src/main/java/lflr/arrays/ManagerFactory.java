package lflr.arrays;

import lflr.arrays.attentionQueues.GeneralQueueRunner;

public class ManagerFactory {
    public static IManager getManager(String option){
        switch (option){
            case "A":
                return new GeneralQueueRunner();
            case "B":
                System.exit(0);
                return null;
            default:
                return new NullManager();
        }

    }
}
