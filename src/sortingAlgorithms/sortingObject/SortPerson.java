package sortingAlgorithms.sortingObject;

public class SortPerson {
    private Person[] array;
    private int length;
    private int index = 0;

    public SortPerson(int length) {
        this.length = length;
        array = new Person[length];
    }

    public void insert(Person element) {
        array[this.index] = element;
        this.index++;
    }

    public void insertSort() {
        Person temp = null;
        int j;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1].getAge() > temp.getAge()) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
