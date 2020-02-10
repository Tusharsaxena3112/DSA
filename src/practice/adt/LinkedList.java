package practice.adt;

public interface LinkedList {
    void addLast(int element);

    void addFirst(int element);

    boolean isEmpty();

    int indexOf(int element);

    boolean contains(int element);

    void removeFirst();
}
