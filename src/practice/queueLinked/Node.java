package practice.queueLinked;

public class Node {

    private int data;
    private Node next;
    private Node previous;

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
