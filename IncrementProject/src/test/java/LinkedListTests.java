import lflr.arrays.linkedlists.ILinkedList;
import lflr.arrays.linkedlists.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LinkedListTests {
    @Test
    public void onInitSizeIsZero() {
        ILinkedList list = new LinkedList();
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void onInitIsEmpty() {
        ILinkedList list = new LinkedList();
        boolean isEmpty =  list.isEmpty();
        Assertions.assertTrue(isEmpty);
    }
    @Test
    public void onInsertingFirst(){
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void onInsertingLast(){
        ILinkedList list = new LinkedList();
        list.addLast(1);
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void onRemovingFirst(){
        ILinkedList list = new LinkedList();
        for(int i = 0; i < 10; i++){
            list.addFirst(i);
        }
        list.removeFirst();
        Assertions.assertEquals(9, list.size());
    }
    @Test
    public void onFirstElement(){
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(10);
        list.addLast(11);
        Assertions.assertEquals(3, list.first().getData());
    }
    @Test
    public void onLastElement(){
        ILinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(10);
        list.addLast(11);
        Assertions.assertEquals(11, list.last().getData());
    }


}
