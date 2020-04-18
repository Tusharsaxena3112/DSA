package practice.sortingPractice.bubbleSort.insertion;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 45, 2, 4, 89, 0, 12, 3};
        InsertionSort insertionSort = new InsertionSort(arr);
        insertionSort.sort();
    }
}
