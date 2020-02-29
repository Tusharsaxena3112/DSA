package practice.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

//        System.out.println(queue.isFull());
//        System.out.println(queue.dequeue());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.dequeue();

        queue.enqueue(60);

//        System.out.println(queue.isEmpty());

        queue.show();
    }
}
