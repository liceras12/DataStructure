package lflr.arrays;

import lflr.arrays.interfaces.IRunner;

public class NullRunner implements IRunner {
    @Override
    public void run() {
        System.out.println("Wrong input or manager not implement yet");
        Main.main(null);
    }
}
