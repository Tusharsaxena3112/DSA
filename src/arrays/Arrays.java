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
}
