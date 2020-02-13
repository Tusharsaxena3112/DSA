package practice.queueLinked;

public class Main {
    public static void main(String[] args) {
        QueueLinked queue = new QueueLinked();
//        ql.dequeue();
        queue.enqueue(10);

        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(56);

//        queue.dequeue();
//        queue.dequeue();

        queue.enqueue(60);

        queue.dequeue();

//        System.out.println(queue.isEmpty());

        queue.show();

    }
}
