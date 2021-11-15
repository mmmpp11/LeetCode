package tree.code104;

/**
 * 104. 二叉树的最大深度
 *
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 解题思路：深搜
 */

public class Java104 {

    class TreeNode {
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

    private int ans = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            dfs(root.left,1);
            dfs(root.right,1);
            return ans;
        }
    }

    public void dfs(TreeNode node,int num){

        if (node != null){
            num++;
            dfs(node.left,num);
            dfs(node.right,num);
        }
        if (num > ans){
            ans = num;
        }
    }
}
