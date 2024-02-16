import lflr.arrays.attentionQueues.EmergencyQueue;
import lflr.arrays.attentionQueues.Entrance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class EmergencyQueueTest {
    @Test
    public void testAddFirst() {
        EmergencyQueue queue = new EmergencyQueue();
        Entrance entrance = new Entrance(1, "John", 25, new Date(), "Headache", "Head", "general");
        queue.addFirst(entrance);
        queue.addFirst(new Entrance(2, "Mary", 30, new Date(), "Stomachache", "Stomach", "general"));
        queue.addFirst(7);
        queue.addFirst(2);
        Assertions.assertEquals(4, queue.size());
    }
    @Test
    public void testAddLast() {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addLast(5);
        queue.addLast(3);
        queue.addLast(7);
        queue.addLast(2);
        Assertions.assertEquals(4, queue.size());
    }
    @Test
    public void testRemoveFirst() {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addFirst(5);
        queue.addFirst(3);
        queue.addFirst(7);
        queue.addFirst(2);
        queue.removeFirst();
        Assertions.assertEquals(3, queue.size());
    }
    @Test
    public void testRemoveLast() {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addFirst(5);
        queue.addFirst(3);
        queue.addFirst(7);
        queue.addFirst(2);
        queue.removeLast();
        Assertions.assertEquals(3, queue.size());
    }
    @Test
    public void testFirst() {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addFirst(5);
        queue.addFirst(3);
        queue.addFirst(7);
        queue.addFirst(2);
        Assertions.assertEquals(2, queue.first());
    }
    @Test
    public void testLast() {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addFirst(5);
        queue.addFirst(3);
        queue.addFirst(7);
        queue.addFirst(2);
        Assertions.assertEquals(5, queue.last());
    }
    @Test
    public void testIsEmpty() {
        EmergencyQueue queue = new EmergencyQueue();
        Assertions.assertTrue(queue.isEmpty());
        queue.addFirst(5);
        Assertions.assertFalse(queue.isEmpty());
    }
    @Test
    public void testSize() {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addFirst(5);
        queue.addFirst(3);
        queue.addFirst(7);
        queue.addFirst(2);
        Assertions.assertEquals(4, queue.size());
    }
}
