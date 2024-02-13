import lflr.arrays.Person;
import lflr.arrays.queues.IQueue;
import lflr.arrays.queues.LinkedListQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTests {

    @Test
    public void onInitSizeIsZero() {
        IQueue<Integer> queue = new LinkedListQueue<>();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    public void onInitIsEmpty() {
        IQueue queue = new LinkedListQueue();
        queue.enqueue(new Person("Marco", 34));
        Assertions.assertFalse(queue.isEmpty());
    }
    @Test
    public void onEnqueue(){
        IQueue<Person> queueEnqueue = new LinkedListQueue<>();
        queueEnqueue.enqueue(new Person("Marco", 34));
        queueEnqueue.enqueue(new Person("Louisa", 14));
        Assertions.assertEquals(2, queueEnqueue.size());
    }
    @Test
    public void onDequeue(){
        IQueue<Person> queueDequeue = new LinkedListQueue<>();
        queueDequeue.enqueue(new Person("Marco", 34));
        queueDequeue.enqueue(new Person("Louisa", 14));
        queueDequeue.dequeue();
        Assertions.assertEquals(1, queueDequeue.size());
    }
    @Test
    public void onFront(){
        IQueue<Person> queue = new LinkedListQueue<>();
        queue.enqueue(new Person("Marco", 34));
        queue.enqueue(new Person("Louisa", 14));
        Person front = queue.first();
        Assertions.assertEquals("Marco", front.getName());
    }
}
