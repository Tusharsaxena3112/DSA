package linkedList;

public class StackExe {
    public static void main(String[] args) {
        StackLinked stackLinked = new StackLinked();
        stackLinked.push(23);
        stackLinked.push(43);
        stackLinked.push(30);

//        stackLinked.pop();

//        stackLinked.peek(43);

        System.out.println(stackLinked.getSize());

        stackLinked.showStack();
    }
}
