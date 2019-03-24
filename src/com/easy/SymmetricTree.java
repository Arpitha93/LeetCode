package com.easy;

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

}