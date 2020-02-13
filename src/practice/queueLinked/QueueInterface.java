package practice.queueLinked;

public interface QueueInterface {
    //insert item into the queue
    void enqueue(int data);

    //delete the item from the queue
    int dequeue();

    //shows the queue
    void show();
}
