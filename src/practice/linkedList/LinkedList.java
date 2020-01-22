package practice.linkedList;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int element) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (current.value == element) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean contains(int element) {
        if (indexOf(element) != -1) {
            return true;
        }
        return false;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
