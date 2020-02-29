package practice.priorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(30);
        pq.enqueue(40);
        pq.enqueue(50);

        pq.enqueue(60);

        pq.traverse();
    }

}
