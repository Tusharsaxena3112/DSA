package practice.binarySearchTreeP;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int element) {
        Node node = new Node(element);
        if (root == null) {
            root = node;
        } else {
            Node temp = root;
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
            } else {
                parent.setRight(node);
            }
        }
    }

    public boolean search(int element) {
        boolean response = false;
        var temp = root;
        while (temp != null) {
            if (temp.getData() == element) {
                response = true;
                break;
            } else {
                if (element <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
    }

    public Node delete(int data) {
        Node response = null;
        Node temp = root;
        Node parent = null;
        while (temp != null && temp.getData() != data) {
            parent = temp;
            if (data <= temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        // till here temp is collecting the node to be deleted.
        // parent is collecting the parent of the node to be deleted.
        if (temp != null) {
            response = temp;
            if (isLeaf(temp)) {    // Case 1- deleting node is a leaf node.
                if (parent != null) {
                    if (data <= parent.getData()) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                } else {
                    root = null;
                }
            } else if (hasLeftChild(temp)) { // Case 2- Deleting a node having a child ie. Left Child.
                if (parent != null) {
                    if (data <= parent.getData()) {
                        parent.setLeft(temp.getLeft());
                    } else {
                        parent.setRight(temp.getLeft());
                    }
                } else {
                    root = temp.getLeft();
                }
            } else if (hasRightChild(temp)) { // Case 3- Deleting a node having a child ie. Right child.
                if (parent != null) {
                    if (data <= parent.getData()) {
                        parent.setLeft(temp.getRight());
                    } else {
                        parent.setRight(temp.getLeft());
                    }
                } else {
                    root = temp.getRight();
                }
            }
        }
        //Case 4 - Deleting node having both child . This case is still left.

        return response;
    }

    private boolean hasRightChild(Node temp) {
        boolean response = false;
        if (temp.getRight() != null && temp.getLeft() == null) {
            response = true;
        }
        return response;
    }

    private boolean hasLeftChild(Node temp) {
        boolean response = false;
        if (temp.getLeft() != null && temp.getRight() == null) {
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

    public void inorder(Node temp) {
        if (temp == null) {
            return;
        } else {
            inorder(temp.getLeft());
            System.out.println(temp.getData());
            inorder(temp.getRight());
        }
    }

    public void postOrder(Node temp) {
        if (temp == null) {
            return;
        } else {
            postOrder(temp.getLeft());
            System.out.println(temp.getData());
            postOrder(temp.getRight());
        }
    }
}
