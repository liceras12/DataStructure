import lflr.arrays.sorting.ISortingMergeSort;
import lflr.arrays.sorting.SortingMergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTest {
    @Test
public void testMergeSort(){
        ISortingMergeSort mergeSort = new SortingMergeSort();
        int[] array = {5, 3, 2, 4, 1};
        int[] sortedArray = mergeSort.mergeSort(array);
        int[] expectedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedArray, sortedArray);
    }
    @Test
    public void testMergeSortWithEmptyArray(){
        ISortingMergeSort mergeSort = new SortingMergeSort();
        int[] array = {};
        int[] sortedArray = mergeSort.mergeSort(array);
        int[] expectedArray = {};
        Assertions.assertArrayEquals(expectedArray, sortedArray);
    }
}
