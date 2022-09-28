package Easy;

import Classes.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        max = findMax(root, max);
        return max;
    }

    public int findMax(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        return Math.max(findMax(root.left, max), findMax(root.right, max)) + 1;
    }
}
