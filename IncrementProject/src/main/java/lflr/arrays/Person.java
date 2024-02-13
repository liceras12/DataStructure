package lflr.arrays;

public class Person {
    public final int age;
    public final String name;

    public Person(){
        this.name = "";
        this.age = 0;
    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public void print(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }
}
