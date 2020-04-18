package sortingAlgorithms.quickSort;

import java.util.Arrays;

public class QuickMain {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {6, 5, 4, 3, 2, 7, 1};
        System.out.println(Arrays.toString(arr));
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
