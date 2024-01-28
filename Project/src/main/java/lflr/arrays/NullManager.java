package lflr.arrays;

public class NullManager implements IManager{
    @Override
    public void run(){
        System.out.println("Wrong input or manager not implement yet");
    }

    @Override
    public void printMenu() {
        System.out.println("Don't have a menu yet");
    }
}
