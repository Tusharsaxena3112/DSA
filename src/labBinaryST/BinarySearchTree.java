package labBinaryST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode treeNode = new TreeNode(data);
        if (isEmpty()) {
            root = treeNode;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (treeNode.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (treeNode.getData() <= parent.getData()) {
                parent.setLeft(treeNode);
            } else {
                parent.setRight(treeNode);
            }
        }
    }

    public boolean search(int data) {
        boolean response = false;
        var temp = root;
        while (temp != null) {
            if (temp.getData() == data) {
                response = true;
                break;
            } else {
                if (data < temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
    }

    public void traverseInOrder(TreeNode treeNode) {
        if (treeNode != null) {
            traverseInOrder(treeNode.getLeft());
            System.out.println(treeNode.getData());
            traverseInOrder(treeNode.getRight());
        }
    }


    public void traverseBreadthFirst(TreeNode node) {
        if (node != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.remove();
                System.out.print(currentNode.getData() + " ");
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
        } else {
            System.out.println("Tree is Empty");
        }
    }

    public TreeNode delete(int data) {
        TreeNode response = null;
        // 1--> Search the node with given value.
        TreeNode temp = root;
        TreeNode parent = null;
        while (temp != null && temp.getData() != data) {
            parent = temp;
            if (data < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        // search end
        // temp is containing the node to be deleted or null
        if (temp != null) {
            response = temp;
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
            } else if (hasLeftChild(temp)) {
                if (parent != null) {
                    if (data < parent.getData()) {
                        parent.setLeft(temp.getLeft());
                    } else {
                        parent.setRight(temp.getLeft());
                    }
                } else {
                    root = temp.getLeft();
                }
            } else if (hasRightChild(temp)) {
                if (parent != null) {
                    if (data < parent.getData()) {
                        parent.setLeft(temp.getRight());
                    } else {
                        parent.setRight(temp.getRight());
                    }
                } else {
                    root = temp.getRight();
                }
            } else {
                TreeNode successor = getSuccessor(temp);
                successor.setLeft(temp.getLeft());
                successor.setRight(temp.getRight());
                if (parent != null) {
                    if (data < parent.getData()) {
                        parent.setLeft(successor);
                    } else {
                        parent.setRight(successor);
                    }
                } else {
                    root = successor;
                }
            }
        }
        return response;
    }

    private TreeNode getSuccessor(TreeNode temp) {
        TreeNode response = null;
        temp = temp.getRight();
        while (temp != null) {
            response = temp;
            temp = temp.getLeft();
        }
        response = delete(response.getData());
        return response;
    }

    private boolean hasRightChild(TreeNode temp) {
        boolean response = false;
        if ((temp.getRight() != null) && (temp.getLeft() == null)) {
            response = true;
        }
        return response;

    }

    private boolean hasLeftChild(TreeNode temp) {
        boolean response = false;
        if ((temp.getLeft() != null) && (temp.getRight() == null)) {
            response = true;
        }
        return response;
    }

    private boolean isLeaf(TreeNode treeNode) {
        return treeNode.getLeft() == null && treeNode.getRight() == null;
    }

    private boolean isEmpty() {
        return root == null;
    }

}
