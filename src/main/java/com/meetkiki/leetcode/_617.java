package com.meetkiki.leetcode;

public class _617 {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }


    public TreeNode merge(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        if (t1.left != null || t2.left != null) {
            t1.left = merge(t1.left, t2.left);
        }
        if (t1.right != null || t2.right != null) {
            t1.right = merge(t1.right, t2.right);
        }
        t1.val = t1.val + t2.val;
        return t1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
