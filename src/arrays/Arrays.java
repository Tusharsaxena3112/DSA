package arrays;

public class Arrays {
    private int length;
    private int[] array;
    private int index;

    public Arrays(int length) {
        this.length = length;
        array = new int[length];
    }

    public void insert(int element) {
        array[index] = element;
        index++;
    }

    public boolean contains(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void delete() {
        if (index >= 0) {
            array[--index] = 0;
        } else {
            System.out.println("Array must have element to implement");
        }
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++)
            System.out.printf("%d ", array[i]);
        System.out.println("]");
    }

    public void sort() {
        int temp = 0;
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
