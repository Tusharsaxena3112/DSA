package linkedList;

import java.util.NoSuchElementException;

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


    public void deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        //[1-->[2-->3]
        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        //[1-->2 3]
        //previous = last
        if (first == last) {
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    public void insertAt(int item, int in) {
        int index = 0;
        Node node = new Node(item);
        var current = first;
        while (current != null) {
            index++;
            if (index == in) {
                node.next = current.next;
                current.next = node;
            }
            current = current.next;
        }
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

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

}
