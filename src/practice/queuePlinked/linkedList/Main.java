package practice.queuePlinked.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(12);
        linkedList.addLast(23);
        linkedList.deleteFirst();

        linkedList.show();
    }
}
