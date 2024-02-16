package lflr.arrays;

public class NullManager implements IManager{
    @Override
    public void run(){
        System.out.println("Wrong input or manager not implement yet");
        Main.main(null);
    }

}
