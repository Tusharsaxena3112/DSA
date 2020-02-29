package practice.priorityQueueLinked;

import practice.queueLinked.Node;

public class LinkedList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

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

    private boolean isEmpty() {
        return first == null;
    }

}
