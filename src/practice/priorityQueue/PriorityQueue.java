package practice.priorityQueue;

public class PriorityQueue {
    int maxSize;
    private int element;
    private int[] queue;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
    }
}
