package arrays;

import java.util.ArrayList;

public class Arrays {
    private int length;
    private int[] array;
    private int index;

    public Arrays(int length) {//Constructor
        this.length = length;
        array = new int[length];
    }

    public void insert(int element) {
        if (index < length) {
            array[index] = element;
            index++;
        } else {
            System.out.println("Array is already full.");
        }
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
            System.out.println("Array must have element to delete");
        }
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < index; i++)
            System.out.printf("%d ", array[i]);
        System.out.println("]");
    }

    public void sort() {   //Using Bubble sort.
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


    public int search(int element) {
        int low = 0;
        int high = array.length;
        java.util.Arrays.sort(array);
        System.out.println(java.util.Arrays.toString(array));
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                low = mid + 1;
            } else if (array[mid] > element) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public boolean isSorted() {
        boolean bool = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                bool = true;
            } else {
                bool = false;
                return bool;
            }
        }
        return bool;
    }

    public Object[] withoutDuplicates() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        for (int k = 0; k < array.length; k++) {
            if (array[k] != 0) {
                al.add(array[k]);
            }
        }


        return al.toArray();

    }
}
