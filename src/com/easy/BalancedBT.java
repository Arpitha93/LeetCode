package com.easy;

public class BalancedBT {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

        public boolean isBalanced(TreeNode root) {
            if(root == null)
                return true;

            int left = height(root.left);
            int right = height(root.right);

            if (Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right))
                return true;

            return false;

     }

     int height(TreeNode node){
          if (node == null)
              return 0;

          return 1 + Math.max(height(node.left), height(node.right));
     }


}