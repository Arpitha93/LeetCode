package com.easy;

public class PathSum {


      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }

     }


        public boolean hasPathSum(TreeNode root, int sum) {
//          int cur = root.val;
//
//
//            if(root == null)
//                return false;
//
//            if(root.left == null && root.right == null) {
//                sum = cur;
//            }
//
//                if(root.left!=null && hasPathSum(root.left, sum))
//                    return  true;
//
//                if(root.right!=null && hasPathSum(root.right, sum))
//                    return  true;
//
//               return hasPathSum(root.left, sum) || hasPathSum(root.right,sum);


            if(root == null)
                return false;

            int cur = sum - root.val;

            if(root.left == null && root.right == null){
                return cur == 0;
            }
            else{
                return hasPathSum(root.left, cur) || hasPathSum(root.right, cur);
            }
            }

    }
