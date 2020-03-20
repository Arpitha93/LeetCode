package com.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOredr(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null)
            return zigzag;

        Stack<TreeNode> leftToRight = new Stack<>();
        Stack<TreeNode> rightToLeft = new Stack<>();
        List<Integer> list = new ArrayList<>();
        leftToRight.push(root);

        while (!leftToRight.isEmpty() || !rightToLeft.isEmpty()) {
            while (!leftToRight.isEmpty()) {
                TreeNode n = leftToRight.pop();
                list.add(n.val);
                if (n.left != null)
                    rightToLeft.push(n.left);
                if (n.right != null)
                    rightToLeft.push(n.right);
            }
            if (!list.isEmpty())
                zigzag.add(new ArrayList<Integer>(list));
            list.clear();

            while (!rightToLeft.isEmpty()) {
                TreeNode n = rightToLeft.pop();
                list.add(n.val);
                if (n.left != null)
                    leftToRight.push(n.right);
                if(n.right != null)
                    leftToRight.push(n.left);
            }

            if (!list.isEmpty())
                zigzag.add(new ArrayList<>(list));
            list.clear();
        }
        return zigzag;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }
}