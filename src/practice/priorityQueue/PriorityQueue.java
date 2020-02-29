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
            queue[rear] = element;
            rear++;
        } else {
            System.out.println("Queue is full");
        }
    }

}
