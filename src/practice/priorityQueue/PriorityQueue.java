package practice.priorityQueue;

import java.util.Arrays;

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
        if (!isFull()) {
            queue[rear % maxSize] = element;
            rear = (rear + 1) % maxSize;
            size++;
//            for(int i=rear;i>front;i--){
//                if(queue[i]>queue[i-1]){
//                    int temp=queue[i];
//                    queue[i]=queue[i-1];
//                    queue[i-1]=temp;
//                }
//            }
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        int response = 0;
        if (!isEmpty()) {
            response = queue[front = (front) % maxSize];
            front = (front + 1) % maxSize;
            size--;
        } else {
            response = -1;
        }
        return response;
    }

    public void traverse() {
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j < size - 1; j++) {
                if (queue[j] < queue[j + 1]) {
                    int temp = queue[j];
                    queue[j] = queue[j + 1];
                    queue[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % maxSize] + " ");
        }
        System.out.println(Arrays.toString(queue));
    }

    public boolean isFull() {
        boolean response = false;
        if (size == maxSize) {
            response = true;
        }
        return response;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }
}
