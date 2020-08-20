package com.easy;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> binaryTree = new LinkedList<>();
        binaryPath(root, "", binaryTree);
        return binaryTree;
    }

    public void binaryPath(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += Integer.toString(root.val);

            if (root.left == null && root.right == null)
                paths.add(path);
            else {
                path += "->";
                binaryPath(root.left, path, paths);
                binaryPath(root.right, path, paths);
            }
        }
    }
}