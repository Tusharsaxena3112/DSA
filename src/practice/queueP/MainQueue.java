package practice.queueP;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
        queue.enqueue(15);
        System.out.println(queue.peek(14));
        queue.show();
    }
}
