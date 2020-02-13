package practice.queueLinked;

public class QueueLinked implements QueueInterface {
    private int size;
    private LinkedList l;

    public QueueLinked() {
        l = new LinkedList();
        this.size = 0;
    }

    @Override
    public void enqueue(int data) {
        l.addLast(data);
        size++;
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            var popped = l.deleteFirst();
            size--;
            return popped.getData();
        } else {
            System.out.println("Queue is empty");
        }
        return 0;
    }

    @Override
    public void show() {
        l.show();
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
