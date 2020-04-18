package practice.sortingPractice.bubbleSort.selection;

import java.util.Arrays;

public class SelectionSort2 {
    private int[] arr;

    public SelectionSort2(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
