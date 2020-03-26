package practice.priorityQueueLinked;

public class Main {
    public static void main(String[] args) {
//        PriorityQueue pq = new PriorityQueue();
//        pq.enqueue(10);
//        pq.enqueue(68);
//        pq.enqueue(28);
////        pq.dequeue();
//
//        pq.display();
        LinkedList linkedList = new LinkedList();
        linkedList.addThroughSorting(21);
        linkedList.addThroughSorting(2);
        linkedList.addThroughSorting(16);
        linkedList.addThroughSorting(1);
        linkedList.addThroughSorting(22);
        System.out.println();
        linkedList.show();
    }

}
