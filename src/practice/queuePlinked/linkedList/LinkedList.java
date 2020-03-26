package practice.queuePlinked.linkedList;

public class LinkedList {
    private Node first;
    private Node last;

    public Node deleteFirst() {
        var response = first;
        if (!isEmpty()) {
            var temp = first.getNext();
            first.setNext(null);
            first = temp;
        }
        return response;
    }

    public void addLast(int element) {
        Node node = new Node(element);
        if (first == null) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public boolean search(int element) {
        var cur = first;
        boolean response = false;
        while (cur != null) {
            if (cur.getData() == element) {
                response = true;
                break;
            }
        }
        return response;
    }

    public void show() {
        var cur = first;
        while (cur != null) {
            System.out.print(cur.getData() + " ");
            cur = cur.getNext();
        }
    }

    public boolean isEmpty() {
        return first == null;
    }
}
