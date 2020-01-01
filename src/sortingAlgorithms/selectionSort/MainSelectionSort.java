package sortingAlgorithms.selectionSort;

public class MainSelectionSort {
    public static void main(String[] args) {
        SelectionSortApp selectionSortApp = new SelectionSortApp(5);
        selectionSortApp.insert(10);
        selectionSortApp.insert(6);
        selectionSortApp.insert(1);
        selectionSortApp.insert(105);
        selectionSortApp.insert(90);

        selectionSortApp.display();
    }
}
