package sortingAlgorithms.quickSort;

public class QuickSort {

    public void sort(int[] arr, int lower, int upper) {
        if (lower < upper) {
            int pivotIndex = partition(arr, lower, upper);
            sort(arr, lower, pivotIndex - 1);
            sort(arr, pivotIndex + 1, upper);
        }
//        System.out.println(Arrays.toString(arr));
    }

    private int partition(int[] arr, int lower, int upper) {

        int pivot = arr[lower];
        int down = lower;
        int up = upper;
        while (down < up) {
            while (arr[down] <= pivot) {
                down++;
            }
            while (arr[up] > pivot) {
                up--;
            }
            if (down < up) {
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        arr[lower] = arr[up];
        arr[up] = pivot;
        return up;
    }
}
