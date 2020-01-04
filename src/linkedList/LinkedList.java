package linkedList;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }
    public void getAll() {
        var current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int indexOf(int value) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    private class Node {    //  Class Node from which the whole LinkedList has been made.
        // LinkedList is the combination of these Nodes and each node contains a value and a pointer to the next node.
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

}
