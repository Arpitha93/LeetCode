package com.easy;

public class DiameterOfBinaryTree {
    int diameterOfTree = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return diameterOfTree;
    }

    public int diameter(TreeNode root) {
        if (root == null)
            return 0;

        int left = diameter(root.left);
        int right = diameter(root.right);
        diameterOfTree = Math.max(diameterOfTree, left + right);
        return Math.max(left , right) + 1;
    }
}