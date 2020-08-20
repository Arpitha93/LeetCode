package com.easy;

import java.util.*;

public class BottomUp_levelOrderTraversal {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root == null) {
                return res;
            }

            Stack<TreeNode> S = new Stack();
            Queue<TreeNode> Q = new LinkedList();
            Q.add(root);

            while(Q.isEmpty() == false) {
                List<Integer> num = new ArrayList<>();

                root = Q.peek();
                Q.remove();
                S.push(root);

                if (root.right != null) {
                    Q.add(root.right);
                }

                if (root.left != null) {
                    Q.add(root.left);
                }


                while (S.empty() == false) {

                    root = S.peek();
                    // System.out.print(root.val + " ");
                    num.add(root.val);
                    S.pop();
                }
                res.add(0, num);
            }
            return res;
        }

}