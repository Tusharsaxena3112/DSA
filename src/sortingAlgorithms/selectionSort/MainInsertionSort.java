package sortingAlgorithms.selectionSort;

public class MainInsertionSort {
    public static void main(String[] args) {
        InsertionSortApp insertionSortApp = new InsertionSortApp(5);
        insertionSortApp.insert(3);
        insertionSortApp.insert(1);
        insertionSortApp.insert(98);
        insertionSortApp.insert(67);
        insertionSortApp.insert(2);

        insertionSortApp.insertSort();
        insertionSortApp.display();
    }
}
