package practice;

import practice.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(13);
        linkedList.addLast(15);

        linkedList.addFirst(11);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addLast(40);

        linkedList.display();
        System.out.println();

        linkedList.addAt(3, 18);

        linkedList.display();
        System.out.println();

//        linkedList.removeFirst();
//        linkedList.removeLast();

        linkedList.deleteBetween(1);

        linkedList.display();
    }
}
