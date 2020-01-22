package practice.linkedList;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int element) {
        Node node = new Node(element);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int element) {
        Node node = new Node(element);
        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
