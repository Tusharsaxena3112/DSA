package linkedList;

public class StackExe {
    public static void main(String[] args) {
        StackLinked stackLinked = new StackLinked();

        LinkedList ll = new LinkedList();
        ll.addFirst(12);
        ll.addLast(23);


        stackLinked.push(ll.getData());
        stackLinked.push(ll.getData());
//        stackLinked.push(30);

//        stackLinked.pop();

//        stackLinked.peek(43);

//        System.out.println(stackLinked.getSize());

        stackLinked.showStack();
    }
}
