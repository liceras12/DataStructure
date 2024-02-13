import lflr.arrays.Person;
import lflr.arrays.stacks.IStack;
import lflr.arrays.stacks.LinkedListStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTests {
    @Test
    public void onInitSizeIsZero() {
        IStack<Integer> stack = new LinkedListStack<>();
        Assertions.assertEquals(0, stack.size());
    }
    @Test
    public void onInitIsEmpty() {
        IStack<Integer> stack = new LinkedListStack<>();
        boolean isEmpty =  stack.isEmpty();
        Assertions.assertTrue(isEmpty);
    }
    @Test
    public void onPushing(){
        IStack<Person> stack = new LinkedListStack<>();
        for(int i = 0; i < 10; i++){
            stack.push(new Person("Matias", 34));
        }
        Assertions.assertEquals(10, stack.size());
    }
    @Test
    public void onPopping(){
        IStack<Person> stack = new LinkedListStack<>();
        for(int i = 0; i < 10; i++){
            stack.push(new Person("Louisa", 34));
        }
        stack.pop();
        Assertions.assertEquals(9, stack.size());
    }
    @Test
    public void onTop(){
        IStack<Person> stack = new LinkedListStack<>();
        stack.push(new Person("Louisa", 34));
        stack.push(new Person("Matias", 14));
        stack.push(new Person("Julia", 17));
        stack.push(new Person("George", 24));
        Person person = stack.top();
        Assertions.assertEquals("George", person.getName());
    }
}
