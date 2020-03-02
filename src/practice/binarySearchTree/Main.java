package practice.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(2);
        bst.add(50);
        bst.add(23);
        bst.add(5);

        bst.displayPreOrder();
        System.out.println();
//        bst.displayPostOrder();
//        System.out.println();
//        bst.displayInOrder();
    }
}
