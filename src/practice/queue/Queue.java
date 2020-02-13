package practice.queue;

import java.util.Arrays;

public class Queue implements QueueInterface {
    private int front;
    private int rear;
    private int maxSize;
    private int size;
    private int[] queue;

    public Queue(int maxSize) {
        queue = new int[maxSize];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.maxSize = maxSize;
    }

    @Override
    public void enqueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % maxSize;
            size++;
        } else {
            System.out.println("Queue is full..");
        }
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            size--;
            return queue[front = (front + 1) % maxSize];
        } else {
            System.out.println("Queue is empty..");
        }
        return 0;
    }

    @Override
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % maxSize] + " ");
        }
        System.out.println(Arrays.toString(queue));
    }


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return size == maxSize;
    }

}
