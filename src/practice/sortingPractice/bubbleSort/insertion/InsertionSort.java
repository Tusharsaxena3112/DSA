package practice.sortingPractice.bubbleSort.insertion;

import java.util.Arrays;

public class InsertionSort {
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
