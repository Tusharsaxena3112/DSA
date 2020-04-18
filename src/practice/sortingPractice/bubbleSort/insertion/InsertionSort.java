package practice.sortingPractice.bubbleSort.insertion;

import java.util.Arrays;

public class InsertionSort {
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int temp;
        for (int i = 1; i < arr.length; i++) {  // 2,1,3,7,5 // 2,2,3,7,5 // 1,2,3,7,5 // 1,2,3,7,7 //1,2,3,5,7
            temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
