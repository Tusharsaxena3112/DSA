package sortingAlgorithms;

public class MainBubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 45, 2, 5, 17};
        BubbleSortApp bubbleSortApp = new BubbleSortApp(arr, arr.length);
        bubbleSortApp.bubbleSort();
        bubbleSortApp.display();
    }
}
