package tree.code101;


import tree.code98.Java98;

/**
 * 101. 对称二叉树
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 解题思路：递归，根据题意得，从第二层开始，我们要判断left.left == right.right 和left.right == right.left
 * 得到递归公式  boolean dfs(TreeNode left,TreeNode right)
 * 先判断是否都为空，则返回true,如果有一个为空或值不相等，则返回false,都不满足就接着递归。
 */

public class Java101 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode left,TreeNode right){
        if ((left == null && right == null)){
            return true;
        }
        if ((left == null || right == null) || left.val != right.val){
            return false;
        }
        return dfs(left.left,right.right) && dfs(left.right,right.left);

    }


}
