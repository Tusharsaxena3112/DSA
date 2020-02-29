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
                if (temp.getData() <= node.getData()) {
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
}
