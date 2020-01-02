package sortingAlgorithms.selectionSort;

public class InsertionSortApp {
    public int[] array;
    public int length;
    public int index = 0;

    public InsertionSortApp(int length) {
        this.length = length;
        array = new int[length];
    }

    public void insert(int element) {
        array[index] = element;
        index++;
    }

    public void insertSort() {
        int temp = 0, j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                array[j - 1] = array[j];
                j--;
            }
            array[j] = temp;
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
