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
}
