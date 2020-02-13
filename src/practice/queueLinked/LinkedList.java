package practice.queueLinked;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        if (first == last) {
            var fi = first;
            first = last = null;
            return fi;
        }
        var response = first;
        var second = first.getNext();
        first.setNext(null);
        first = second;
        return response;
    }

    private boolean isEmpty() {
        return first == null;
    }

}
