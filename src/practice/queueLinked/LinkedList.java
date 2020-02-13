package practice.queueLinked;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

    }

    private boolean isEmpty() {
        return first == null;
    }

    private class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
        }
    }


}
