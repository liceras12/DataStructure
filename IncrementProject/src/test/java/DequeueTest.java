import lflr.arrays.queues.Dequeue;
import lflr.arrays.queues.IDequeue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DequeueTest {
    @Test
    public void onInitSizeIsZero() {
        IDequeue queue = new Dequeue();
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    public void onInitIsEmpty() {
        IDequeue queue = new Dequeue();
        queue.addFirst(1);
        Assertions.assertFalse(queue.isEmpty());
    }

    @Test
    public void onAddFirst() {
        IDequeue queue = new Dequeue();
        queue.addFirst(1);
        queue.addFirst(2);
        Assertions.assertEquals(2, queue.size());
    }
    @Test
    public void onAddLast(){
        IDequeue queue = new Dequeue();
        queue.addLast(1);
        queue.addLast(2);
        Assertions.assertEquals(2, queue.size());
    }
    @Test
    public void onRemoveFirst(){
        IDequeue queue = new Dequeue();
        queue.addFirst(1);
        queue.addFirst(2);
        queue.removeFirst();
        Assertions.assertEquals(1, queue.size());
    }
    @Test
    public void onRemoveLast(){
        IDequeue queue = new Dequeue();
        queue.addLast(1);
        queue.addLast(2);
        queue.removeLast();
        Assertions.assertEquals(1, queue.size());
    }
    @Test
    public void onFirst(){
        IDequeue queue = new Dequeue();
        queue.addFirst(1);
        queue.addFirst(2);
        int first = queue.first();
        Assertions.assertEquals(2, first);
    }
    @Test
    public void onLast(){
        IDequeue queue = new Dequeue();
        queue.addLast(1);
        queue.addLast(2);
        int last = queue.last();
        Assertions.assertEquals(2, last);
    }
}
