package practice.priorityQueueLinked;

public class Main {
    public static void main(String[] args) {
        PriorityQueueLinked pq = new PriorityQueueLinked();
        pq.enqueue(10);
        pq.enqueue(68);
        pq.enqueue(28);
//        pq.dequeue();

        pq.traverse();
    }

}
