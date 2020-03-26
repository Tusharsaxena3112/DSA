package practice.queuePlinked;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.show();
    }
}
