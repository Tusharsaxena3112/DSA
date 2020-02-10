package linkedList;

public class StackLinked {

    private LinkedList linkedList = new LinkedList();
    private int size;

    public StackLinked() {
        this.size = 0;
    }

    public void push(int element) {
        linkedList.addFirst(element);
        size++;
    }

    public void pop() {
        linkedList.deleteFirst();
        size--;
    }

    public void peek(int element) {
        System.out.println(linkedList.indexOf(element));
    }

    public void showStack() {
        linkedList.getAll();
    }

    public int getSize() {
        return size;
    }
}
