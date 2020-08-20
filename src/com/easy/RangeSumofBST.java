package com.easy;

import java.util.Stack;

public class RangeSumofBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (L <= node.val && node.val <= R){
                    res += node.val;
                }

                if (L < node.val)
                    stack.push(node.left);

                if (node.val < R)
                    stack.push(node.right);

            }
        }
        return res;
    }
}