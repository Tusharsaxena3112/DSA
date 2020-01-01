package sortingAlgorithms.selectionSort.BubbleSort;

public class BubbleSortApp<T> {
    public int length;
    public int index = 0;
    public int[] array;

    public BubbleSortApp(int length) {
        this.length = length;
        array = new int[length];
    }

    public void insert(int element) {
        array[this.index] = element;
        this.index++;
    }

    public void bubbleSort() {
        int temp = 0;
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
