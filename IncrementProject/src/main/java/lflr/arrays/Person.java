package lflr.arrays;

public class Person {
    public final int id;
    public final String name;

    public Person (int id, String name){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person : " + id + name;
    }
}
