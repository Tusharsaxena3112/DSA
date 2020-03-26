package practice.queuePlinked;

import practice.queuePlinked.linkedList.LinkedList;
import practice.queuePlinked.linkedList.Node;

public class Queue {
    LinkedList linkedList = new LinkedList();

    public void enqueue(int element) {
        linkedList.addLast(element);
    }

    public Node dequeue() {
        if (!linkedList.isEmpty()) {
            return linkedList.deleteFirst();
        } else {
            System.out.println("Underflow");
            return null;
        }
    }

    public boolean peek(int element) {
        return linkedList.search(element);
    }

    public void show() {
        linkedList.show();
    }
}
