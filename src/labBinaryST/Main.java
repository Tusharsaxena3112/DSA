package labBinaryST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(30);
        bst.insert(20);
        bst.insert(45);


        System.out.println(bst.search(45));


        bst.traverseInOrder(bst.getRoot());

    }
}
