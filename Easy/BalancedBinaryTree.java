package Easy;

import Classes.TreeNode;

public class BalancedBinaryTree {
    boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        find(root);
        return balanced;
    }

    public int find(TreeNode current) {
        if (!balanced) {
            return 0;
        }
        if (current == null) {
            return 0;
        }

        int left = find(current.left);
        int right = find(current.right);

        if (Math.abs(left - right) > 1) {
            balanced = false;
            return 0;
        }

        return Math.max(left, right) + 1;
    }

}
