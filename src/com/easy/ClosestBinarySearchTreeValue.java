package com.easy;

public class ClosestBinarySearchTreeValue {
    public int closestTree(TreeNode root, int target) {
        int closestVal = root.val;
        while (root != null) {
            int closest = root.val;
            closestVal = Math.abs(closestVal - target) < Math.abs(closest - target) ? closestVal : closest;
            root = target < root.val ? root.left : root.right;
        }

        return closestVal;
    }
}