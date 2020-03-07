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
        inOrder(root);
    }

//    public void displayPostOrder() {
//        postOrder(root);
//    }

    public Node delete(int data) {
        Node response = null;
        Node temp = root;
        Node parent = null;
        while (temp != null && temp.getData() != data) {
            parent = temp;
            if (data < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (temp != null) {
            response = temp;
            //Ist case ie. deleting a Leaf node.
            if (isLeaf(temp)) {
                if (parent != null) {
                    if (data < parent.getData()) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                } else {
                    root = null;
                }
            }
            //IInd case ie . Deleting a Node having either left or right child.
            else if (hasRight(temp)) {
                if (parent != null) {
                    if (data < parent.getData()) {
                        parent.setLeft(temp.getRight());
                    } else {
                        parent.setRight(temp.getRight());
                    }
                } else {
                    root = temp.getRight();
                }
            } else if (hasLeft(temp)) {
                if (parent != null) {
                    if (data < parent.getData()) {
                        parent.setLeft(temp.getLeft());
                    } else {
                        parent.setRight(temp.getLeft());
                    }
                } else {
                    root = parent.getLeft();
                }
            }
        }
        return response;
    }

    private boolean hasLeft(Node temp) {
        boolean response = false;
        if (temp.getRight() == null && temp.getLeft() != null) {
            response = true;
        }
        return response;
    }

    private boolean hasRight(Node temp) {
        boolean response = false;
        if (temp.getRight() != null && temp.getLeft() == null) {
            response = true;
        }
        return response;
    }

    private boolean isLeaf(Node temp) {
        boolean response = false;
        if (temp.getLeft() == null && temp.getRight() == null) {
            response = true;
        }
        return response;
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
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
