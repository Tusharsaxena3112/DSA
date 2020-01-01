package sortingAlgorithms.selectionSort;

public class SelectionSortApp {
    public int[] array;
    public int length;
    public int index = 0;

    public SelectionSortApp(int length) {
        this.length = length;
        array = new int[length];
    }

    public void insert(int element) {
        array[this.index] = element;
        index++;
    }

    public void selectionSort() {
        int min;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
