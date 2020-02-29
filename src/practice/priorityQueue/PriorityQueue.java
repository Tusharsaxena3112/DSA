package practice.priorityQueue;

public class PriorityQueue {
    int maxSize;
    private int[] queue;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }

    public void enqueue(int element) {
        if (rear < maxSize) {
            queue[rear % maxSize] = element;
            rear = (rear + 1) % maxSize;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        int response = 0;
        if (front >= 0) {
            response = queue[front = (front + 1) % maxSize];
            size--;
        } else {
            response = -1;
        }
        return response;
    }

    public void traverse() {
        for (int i = front; i < size; i++) {
            System.out.print(queue[i % maxSize] + " ");
        }
    }

    public boolean isFull() {
        boolean response = false;
        if (size == maxSize) {
            response = true;
        }
        return response;
    }
}
