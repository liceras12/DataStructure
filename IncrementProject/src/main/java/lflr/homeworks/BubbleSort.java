package lflr.homeworks;

public class BubbleSort implements IBubbleSort{

    int size = 0;
    int count = 0;
    @Override
    public void addSize(int size) {
        this.size = size;
    }

    @Override
    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size-1; j++){
                if (array[j] > array[j+1]){
                    array = swap(array, j, j+1);
                }
            }
        }
        return array;
    }

    @Override
    public int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    @Override
    public int[] add(int[] array, int value) {
        array[count] = value;
        count++;
        return array;
    }

    public void printArray(int[] array){
        for (int i = 0; i < size; i++){
            System.out.println(" " + array[i]);
        }
    }
}
