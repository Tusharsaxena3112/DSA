package queue;

public class ExecutionQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.dequeue(2);
        queue.dequeue(3);
        queue.dequeue(5);
        queue.dequeue(10);
        queue.dequeue(12);
//        queue.enqueue();
        queue.dequeue(23);
        queue.dequeue(34);
        queue.showQueue();
    }
}
