package practice.binarySearchTreeP;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.inorder(tree.getRoot());

        System.out.println(tree.search(20));
    }
}
