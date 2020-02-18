package doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.addFirst(10);
        dl.addFirst(11);
        dl.addFirst(12);
        dl.addFirst(19);

        dl.addLast(15);
        dl.addLast(20);


        dl.show();
    }
}
