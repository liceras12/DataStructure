package lflr.arrays.sorting;

public interface ISortingMergeSort {
    /**
     * @param size the size of the array
     */
    void addSize(int size);

    /**
     * @param array the array to be sorted
     * @return the sorted array
     */
    int[] mergeSort(int[] array);

    /**
     * @param left the left array
     * @param right the right array
     * @return the merged array
     */
    int[] merge(int[] left, int[] right);

    /**
     * @param array the array to add the value
     * @param value the value to be added
     * @return the array with the value added
     */
    int[] add(int[] array, int value);
}
