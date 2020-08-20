package com.easy;

public class PathSum3 {
    int totalPath = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;

        traversePath(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);

        return totalPath;
    }

    private void traversePath(TreeNode root, int sum, int curSum) {
        if (root == null)
            return;

        curSum += root.val;
        if (curSum == sum)
            totalPath++;
        traversePath(root.left, sum, curSum);
        traversePath(root.left, sum, curSum);
    }
}