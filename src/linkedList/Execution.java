package linkedList;

public class Execution {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addFirst(3);
        linkedList.addFirst(10);


        linkedList.deleteFirst();
        linkedList.deleteLast();
        linkedList.getAll();
    }
}
