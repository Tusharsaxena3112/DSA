package stack1;

public class Stack {
    int top = 0;
    private int arr[];
    private int size;

    public Stack(int size) {
        arr = new int[size];
    }

    public void push(int element) {
        arr[top] = element;
        top++;
    }

    public void display() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
//     1-- > Push()  ----> similar as append in list;
//    2---> Pop()--->  delete from last.
//    3 ----> peek() ----> searching;
}
