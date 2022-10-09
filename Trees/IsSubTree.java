package Trees;

import Classes.TreeNode;

class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null && root == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null && root == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            return isSameTree(root.right, subRoot.right) && isSameTree(root.left, subRoot.left);
        }

        return false;
    }
}