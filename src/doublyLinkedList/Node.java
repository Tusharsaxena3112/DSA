package doublyLinkedList;

public class Node {
    private Node next;
    private Node previous;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}
