package practice.binarySearchTree;

public class BinarySearchTree {
    private Node root;

    public boolean add(int element) {
        Node node = new Node(element);
        boolean response = false;
        if (root == null) {
            root = node;
            response = true;
        } else {
            var temp = root;
            Node parent = null;
            while (temp != null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (node.getData() <= parent.getData()) {
                parent.setLeft(node);
                response = true;
            } else {
                parent.setRight(node);
                response = true;
            }
        }
        return response;
    }

    public void displayPreOrder() {
        preOrder(root);
    }

    public void displayInOrder() {

    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    private void inOrder(Node node) {
        if (root == null) {
            return;
        } else {
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    private void postOrder(Node node) {
        if (root == null) {
            return;
        } else {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
