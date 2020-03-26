package practice.queueP;

public class Queue {
    int[] queue;
    private int top = 0;
    private int rear = 0;
    private int size = 0;
    private int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }

    public void enqueue(int element) {
        if (!isFull()) {
            queue[rear] = element;
            rear = (rear + 1) % maxSize;
            size++;
        } else {
            System.out.println("Queue is full.");
        }
    }

    public int dequeue() {
        int popped = -1;
        if (!isEmpty()) {
            popped = queue[top];
            top = (top + 1) % maxSize;
            size--;
        } else {
            System.out.println("Queue is empty");
        }
        return popped;
    }

    public boolean peek(int element) {
        boolean response = false;
        for (int i = 0; i < maxSize; i++) {
            if (queue[i] == element) {
                response = true;
            }
        }
        return response;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(i + top) % maxSize] + " ");
        }
    }


    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == maxSize;
    }
}
