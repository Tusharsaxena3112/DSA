package dsalab1.adts;

import dsalab1.adts.interfaces.MyArrayInter;

// We will create a My array ADT .It is an  which contains Array called Data .
//A private field called size and another private field called element count and that ADT contains 4 methods ..... > Insert , delete , search ,and sort.
public class MyArrayAdt implements MyArrayInter {
    private int size;
    private int[] arr;
    private int elementCount;

    public MyArrayAdt(int size) {
        this.size = size;
        arr = new int[size];
        this.elementCount = 0;
    }

    @Override
    public void traverse() {
        System.out.println("Printing Array.");
        for (int i = 0; i < elementCount; i++) {
            if (i == elementCount - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    @Override
    public boolean insert(int element) {
        if (!isFull()) {
            arr[elementCount] = element;
            this.elementCount++;
            return true;
        } else {
            System.out.println("Not enough space.");
        }
        return false;
    }


    @Override
    public boolean contains(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int delete() {
        int response = 0;
        if (!isEmpty()) {
            elementCount--;
            response = arr[elementCount];
        }
        return response;
    }

    private boolean isEmpty() {
        boolean response = false;
        if (this.elementCount == 0) {
            response = true;
        }
        return response;
    }

    private boolean isFull() {
        boolean response = false;
        if (this.elementCount == arr.length) {
            response = true;
        }
        return response;
    }

}
