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
        if (!isFull()) {
            queue[rear] = data;
            rear++;
            size++;
        } else {
            System.out.println("Queue is full..");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            size--;
            return queue[front++];
        } else {
            System.out.println("Queue is empty..");
        }
        return 0;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[front + i] + " ");
        }
    }


    public boolean isEmpty() {
        return size < maxSize;
    }

    public boolean isFull() {
        return size == maxSize;
    }

}
