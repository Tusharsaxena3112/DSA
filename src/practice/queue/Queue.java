package practice.queue;

public class Queue {
    private int front;
    private int rear;
    private int maxSize;
    private int size;
    private int[] queue;

    public Queue(int maxSize) {
        queue = new int[maxSize];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(int data) {
        if (isEmpty()) {

        }
    }

    public boolean isEmpty() {
        return size < maxSize;
    }

    public boolean isFull() {
        return size == maxSize;
    }

}
