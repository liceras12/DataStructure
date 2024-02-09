package lflr.arrays.sorting;

public interface ISortingMergeSort {
    void addSize(int size);
    int[] mergeSort(int[] array);
    int[] merge(int[] left, int[] right);
    int[] add(int[] array, int value);
}
