package practice.priorityQueue;

public class PriorityQueue {
    int maxSize;
    private int[] queue;
    int front = 0;
    int rear = 0;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }

    public void enqueue(int element) {
        if (rear < maxSize) {
            queue[rear % maxSize] = element;
            rear = (rear + 1) % maxSize;
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        int response = 0;
        if (front >= 0) {
            response = queue[front = (front + 1) % maxSize];
        } else {
            response = -1;
        }
        return response;
    }

}
