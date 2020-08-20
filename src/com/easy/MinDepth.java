package com.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public class TreeNode {
        int val;
        MinDepth.TreeNode left;
        MinDepth.TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int minDepth(TreeNode root) {
//        if(root == null)
//            return 0;
//
//        if(root.left == null && root.right == null)
//            return 1;
//
//        int leftTree = 1 + minDepth(root.left);
//        int rightTree = 1 + minDepth(root.right);
//
//        if(root.left == null)
//            return rightTree;
//        else if (root.right == null)
//            return leftTree;
//        else
//            return 1 + Math.min(minDepth(root.right), minDepth(root.left));


        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Q.add(root);
        int depth = 0;

        while(!Q.isEmpty()) {
            //root = Q.poll();
            TreeNode temp = Q.poll();
            depth++;

           // Queue<TreeNode> temp = new LinkedList<TreeNode>();

            if (temp.left != null)
                Q.add(temp.left);

            if (temp.right != null)
                Q.add(temp.right);

            if (temp.left == null || temp.right == null)
                return  depth;

            Q.add(temp);

        }
        return depth;

    }
}