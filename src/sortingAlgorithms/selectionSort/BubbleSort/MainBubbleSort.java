package sortingAlgorithms.selectionSort.BubbleSort;

public class MainBubbleSort {
    public static void main(String[] args) {
        //int arr[] = {3, 45, 2, 5, 17};
        BubbleSortApp bubbleSortApp = new BubbleSortApp(5);
        bubbleSortApp.insert(9);
        bubbleSortApp.insert(555);
        bubbleSortApp.insert(2);
        bubbleSortApp.insert(60);
        bubbleSortApp.insert(3);
        bubbleSortApp.bubbleSort();
        bubbleSortApp.display();
    }
}
