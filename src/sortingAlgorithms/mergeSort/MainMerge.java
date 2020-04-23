package sortingAlgorithms.mergeSort;

import java.util.Arrays;

public class MainMerge {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4};
        MergeSort mergeSort = new MergeSort(arr);
        mergeSort.mergeSort(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
