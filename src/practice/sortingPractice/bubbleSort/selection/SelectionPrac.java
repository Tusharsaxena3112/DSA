package practice.sortingPractice.bubbleSort.selection;

import java.util.Arrays;

public class SelectionPrac {
    private int[] arr;

    public SelectionPrac(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
