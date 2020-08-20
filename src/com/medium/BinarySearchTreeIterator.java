package com.medium;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator {
    List<Integer> list = new ArrayList<>();
    int node = 0;

    public BSTIterator(TreeNode root) {
        inorder(root);
    }

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(node.left);
        visit(root);
        inorder(node.right);
    }

    public int visit(TreeNode root) {
        return visit(node.val);
    }

    public int next(TreeNode root) {
        if (hasNext()) {
            int val = list.get(node);
            node++;
            return val;
        }

        return 0;
    }

    public boolean hasNext() {
        return node < list.size();
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}