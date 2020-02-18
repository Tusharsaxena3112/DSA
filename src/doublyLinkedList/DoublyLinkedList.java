package doublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;


    public void addFirst(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = last = node;
        } else {
            node.setNext(first);
            first.setPrevious(node);
            first = node;
        }
    }


    public void addLast(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = last = node;
        } else {
            node.setPrevious(last);
            last.setNext(node);
            last = node;
        }
    }

    public void traverseReverse() {
        var current = last;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPrevious();
        }
        System.out.println();
    }

    public void deleteLast() {
        if (first == null) {
            System.out.println("Must have elements to delete.");
        } else if (first.getNext() == null) {
            first = last = null;
//            System.out.println("Must have elements to delete.");
        } else {
            last = last.getPrevious();
            last.setNext(null);
        }
    }

    public void deleteFirst() {

    }

    public void show() {
        var current = first;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
