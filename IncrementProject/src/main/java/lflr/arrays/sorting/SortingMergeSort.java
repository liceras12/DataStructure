package lflr.arrays.sorting;

public class SortingMergeSort implements ISortingMergeSort {
    int size = 0;
    public int count = 0;
    @Override
    public void addSize(int size){
        this.size = size-1;
    }

    @Override
    public int[] mergeSort(int[] array){
        if (array.length <= 1){
            return array;
        }
        int middle = array.length / 2;
        int[] left = new int[middle];
        int[] right = new int[array.length-middle];
        System.arraycopy(array, 0, left, 0, middle);
        if (array.length - middle >= 0){
            System.arraycopy(array, middle, right, 0, array.length-middle);
        }
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    @Override
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        while (leftPointer < left.length && rightPointer < right.length){
            if (left[leftPointer] < right[rightPointer]){
                result[resultPointer++] = left[leftPointer++];
            } else {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        while (leftPointer < left.length){
            result[resultPointer++] = left[leftPointer++];
        }
        while (rightPointer < right.length){
            result[resultPointer++] = right[rightPointer++];
        }
        return result;
    }

    @Override
    public int[] add(int[] array, int value){
        array[count] = value;
        count++;
        return array;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
