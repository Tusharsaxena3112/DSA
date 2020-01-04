package linkedList;

public class Execution {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addFirst(3);

        System.out.println(linkedList.indexOf(5));
        System.out.println(linkedList.contains(8));

        linkedList.getAll();
    }
}
