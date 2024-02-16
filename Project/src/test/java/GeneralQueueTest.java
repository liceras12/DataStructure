import lflr.arrays.attentionQueues.GeneralQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneralQueueTest {
    @Test
    public void testAddFirst() {
        GeneralQueue queue = new GeneralQueue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(2);
        Assertions.assertEquals(4, queue.size());
    }
    @Test
    public void testAddLast() {
        GeneralQueue queue = new GeneralQueue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(2);
        Assertions.assertEquals(4, queue.size());
    }
    @Test
    public void testRemoveFirst() {
        GeneralQueue queue = new GeneralQueue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(2);
        queue.dequeue();
        Assertions.assertEquals(3, queue.size());
    }
    @Test
    public void testRemoveLast() {
        GeneralQueue queue = new GeneralQueue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(2);
        queue.dequeue();
        Assertions.assertEquals(3, queue.size());
    }
    @Test
    public void testFirst() {
        GeneralQueue queue = new GeneralQueue();
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(2);
        Assertions.assertEquals(5, queue.first());
    }
}
