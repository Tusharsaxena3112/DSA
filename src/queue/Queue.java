package queue;

public class Queue {
    private int length;
    private int front;
    private int rear;
    private int[] queue;
    private int size;

    public Queue(int length) {
        this.length = length;
        queue = new int[length];
    }

    public void dequeue(int element) {
        if (isEmpty()) {
            queue[rear] = element;
            rear = (rear + 1) % length;
            size++;
        } else {
            System.out.println("Queue already is full.");
        }
    }

    public int enqueue() {
        if (size > 0) {
            size--;
            return queue[front = (front + 1) % length];
        }
        return 0;
    }

    public void showQueue() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % length] + " ");
        }
    }

    public boolean isEmpty() {
        if (size < length) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == length) {
            return true;
        }
        return false;
    }

}
