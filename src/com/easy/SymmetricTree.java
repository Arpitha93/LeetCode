package com.easy;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null)
                return true;

            if(p!=null && q!=null)
                return (p.val == q.val && isSameTree(p.left, q.right) &&
                        isSameTree(p.right, q.left));

            return false;

        }
        public boolean isSymmetric(TreeNode root) {
            return isSameTree(root, root);

        }


    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty())
        {
            TreeNode tempLeft = q.remove();
            TreeNode tempRight = q.remove();

            if (tempLeft==null && tempRight==null)
                continue;

            if ((tempLeft==null && tempRight!=null) ||
                    (tempLeft!=null && tempRight==null))
                return false;

            if (tempLeft.val != tempRight.val)
                return false;

            q.add(tempLeft.left);
            q.add(tempRight.right);
            q.add(tempLeft.right);
            q.add(tempRight.left);
        }

        return true;
    }

}