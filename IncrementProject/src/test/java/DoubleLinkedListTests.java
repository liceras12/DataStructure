import lflr.arrays.linkedlists.DoubleLinkedList;
import lflr.arrays.linkedlists.IDoubleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleLinkedListTests {
    @Test
    public void onInitSizeIsZero() {
        IDoubleLinkedList doubleList = new DoubleLinkedList();
        Assertions.assertEquals(0, doubleList.size());
    }

    @Test
    public void onInitIsEmpty() {
        IDoubleLinkedList doubleList = new DoubleLinkedList();
        boolean isEmpty =  doubleList.isEmpty();
        Assertions.assertTrue(isEmpty);
    }

    @Test
    public void onInsertingFirst(){
        IDoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.addFirst(1);
        Assertions.assertEquals(1, doubleList.size());
    }

    @Test
    public void onInsertingLast(){
        IDoubleLinkedList doubleList = new DoubleLinkedList();
        doubleList.addLast(1);
        Assertions.assertEquals(1, doubleList.size());
    }

    @Test
    public void onRemovingFirst(){
        IDoubleLinkedList doubleList = new DoubleLinkedList();
        for(int i = 0; i < 10; i++){
            doubleList.addFirst(i);
        }
        doubleList.removeFirst();
        Assertions.assertEquals(9, doubleList.size());
    }

    @Test
    public void onRemovingLast(){
        IDoubleLinkedList doubleList = new DoubleLinkedList();
        for(int i = 0; i < 10; i++){
            doubleList.addFirst(i);
        }
        doubleList.removeLast();
        doubleList.removeLast();
        Assertions.assertEquals(8, doubleList.size());
    }
}
