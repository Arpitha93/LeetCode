package com.easy;

public class MaxDepth {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        else {
            int leftNode =  maxDepth(root.left);
            int rightNode = maxDepth(root.right);

            if (leftNode > rightNode)
                return (leftNode + 1);
            else
                return (rightNode + 1);
        }
    }

}