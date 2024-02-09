package lflr.homeworks;

public interface IBubbleSort {
    /**
     * @param size the size for de array
     */
    void addSize(int size);

    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    int[] bubbleSort(int[] array);

    /**
     * @param array the array to be sorted
     * @param i the first index to be swapped
     * @param j the second index to be swapped
     * @return the array with the elements in the i and j indexes swapped
     */
    int[] swap(int[] array, int i, int j);

    /**
     * @param array the array to be sorted
     * @param value the value to be added to the array
     * @return the array with the value added
     */
    int[] add(int[] array, int value);
}
