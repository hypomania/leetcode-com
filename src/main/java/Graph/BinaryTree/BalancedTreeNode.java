package Graph.BinaryTree;

public class BalancedTreeNode extends TreeNode {

    private int height = 1;

    public BalancedTreeNode left;

    public BalancedTreeNode right;

    public BalancedTreeNode(int x) {
        super(x);
    }

    private int balancedFactor(BalancedTreeNode x) {
        if (x == null) return 0;
        int leftHeight = (x.left != null) ? x.left.getHeight() : 0;
        int rightHeight = (x.right != null) ? x.right.getHeight() : 0;
        return leftHeight - rightHeight;
    }

    private int getHeight() {
        return height;
    }

    private void fixHeight(BalancedTreeNode n) {
        if (n == null) return;
        int hl = (n.left != null) ? n.left.getHeight() : 0;
        int hr = (n.right != null) ? n.right.getHeight() : 0;
        n.height = (hl > hr ? hl : hr) + 1;
    }

    BalancedTreeNode rotateRight(BalancedTreeNode node) {
        if (node == null) return node;
        BalancedTreeNode newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        fixHeight(node);
        fixHeight(newRoot);
        return newRoot;
    }

    BalancedTreeNode rotateLeft(BalancedTreeNode node) {
        BalancedTreeNode newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        fixHeight(node);
        fixHeight(newRoot);
        return newRoot;
    }

    BalancedTreeNode balance(BalancedTreeNode x) {
        fixHeight(x);
        if (balancedFactor(x) == -2) {
            if (balancedFactor(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            return rotateLeft(x);
        }
        if (balancedFactor(x) == 2) {
            if (balancedFactor(x.left) < 0) {
                x.left = rotateLeft(x.left);
            }
            return rotateRight(x);
        }
        return x;
    }

    public BalancedTreeNode insert(BalancedTreeNode x, int val) {
        if (x == null) {
            return new BalancedTreeNode(val);
        }
        if (val < x.val) {
            x.left = insert(x.left, val);
        } else {
            x.right = insert(x.right, val);
        }
        return balance(x);
    }
}
