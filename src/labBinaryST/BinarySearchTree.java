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


    public boolean isEmpty() {
        return root == null;
    }
}
