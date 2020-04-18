package practice.sortingPractice.bubbleSort.selection;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 20, 6, 3, 2, 7};
//        SelectionSort selectionSort = new SelectionSort(arr);
//        selectionSort.sort();
        SelectionPrac selectionPrac = new SelectionPrac(arr);
        selectionPrac.sort();
    }
}
