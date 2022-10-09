package Trees;

import Classes.TreeNode;

public class SameTree {
    boolean sameTree = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverse(p, q);
        return sameTree;
    }

    public void traverse(TreeNode p, TreeNode q) {
        
        // tree has been determined to be not the same so return
        if(!sameTree) {
            return;
        }

        if(p == null && q == null){
            return;
        }

        // found a node on one side but not the other
        if((p == null && q != null) || (p != null && q == null) || p.val != q.val){
            sameTree = false;
            return;
        }

        traverse(p.right, q.right);
        traverse(p.left, q.left);
    }
}
