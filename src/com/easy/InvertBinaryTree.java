package com.easy;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
  }

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

//        if(root == null)
//            return root ;
//
//        while(root.left != null && root.right != null){
//            TreeNode temp = root.left;
//            root.left = root. right;
//            root.right = temp;
//        }
//
//        return root;


        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        if(root == null)
            return root ;

        while(q.size() > 0){
            TreeNode cur = q.peek();
            q.remove();

            TreeNode temp = cur.left;
            cur.left = cur. right;
            cur.right = temp;

            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);
        }

        return root;
    }

}