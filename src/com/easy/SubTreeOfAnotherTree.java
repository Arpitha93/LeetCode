package com.easy;

import java.util.LinkedList;
import java.util.Queue;

public class SubTreeOfAnotherTree {
    public boolean isSubTree(TreeNode s, TreeNode t){
        boolean res = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()){
            TreeNode node = q.poll();
            res = isSameTree(node, t);
            if(res)
                return true;
            if(node!=null)
                q.add(node.left);
            q.add(node.right);
        }
        return false;
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s==null && t==null)
            return true;

        if ((s!=null && t!=null) && (s.val == t.val))
                return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);

        return false;
    }

}