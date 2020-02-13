package practice.queue;

public class Queue {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queue;

    public Queue(int maxSize) {
        queue = new int[maxSize];
        this.front = 0;
        this.rear = 0;
    }




}
