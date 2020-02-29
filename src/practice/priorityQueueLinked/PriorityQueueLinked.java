package practice.priorityQueueLinked;

public class PriorityQueueLinked {
    private int temp;
    private LinkedList linkedList = new LinkedList();

    public void enqueue(int element) {
        if (linkedList.getFirst() == null) {
            linkedList.addFirst(element);
            temp = element; //temp=10
        } else if (temp < element) {
            linkedList.addFirst(element);
//            temp=element;
        } else if (temp > element) {
            linkedList.addLast(element);
            temp = element;
        }
    }

    public practice.queueLinked.Node dequeue() {
        practice.queueLinked.Node d = linkedList.deleteFirst();
        return d;
    }

    public void traverse() {
        linkedList.show();
    }
}
