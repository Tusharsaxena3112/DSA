package labBinaryST;

public class BinarySearchTree {
    private TreeNode root;

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

    private boolean isEmpty() {
        return root == null;
    }

}
