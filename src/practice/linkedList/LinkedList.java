package practice.linkedList;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node node;

        public Node(int value) {
            this.value = value;
        }
    }


}
