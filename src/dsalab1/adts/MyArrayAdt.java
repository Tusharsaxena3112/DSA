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

    //    public int[] sort(){
//        int array = new int[];
//        return 0;
//    }
    @Override
    public boolean insert(int element) {
        if (this.elementCount != size) {
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

    private boolean isFull() {
        boolean response = false;
        if (this.elementCount == arr.length) {
            response = true;
        }
        return response;
    }

}
