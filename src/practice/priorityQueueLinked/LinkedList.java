package practice.priorityQueueLinked;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

//    public Node getFirst() {
//        return first;
//    }
//
//    public void setFirst(Node first) {
//        this.first = first;
//    }
//
//    public Node getLast() {
//        return last;
//    }
//
//    public void setLast(Node last) {
//        this.last = last;
//    }

    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
        size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        if (first == last) {
            var fi = first;
            first = last = null;
            size--;
            return fi;
        }
        var response = first;
        var second = first.getNext();
        first.setNext(null);
        first = second;
        size--;
        return response;
    }

    public void show() {
        var current = first;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    public Node getPreviousNode(Node node) {
        var current = first;
        while (current.getNext() != null) {
            if (current.getNext() == node) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void addThroughSorting(int element) {
        Node node = new Node(element);
        if (first == null) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
        var current = first;
        while (current != null) {
            if (node.getData() > current.getData()) {
                int temp = current.getData();
                current.setData(node.getData());
                node.setData(temp);
            }
            current = current.getNext();
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

}
