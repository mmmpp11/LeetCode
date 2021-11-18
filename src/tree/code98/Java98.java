package tree.code98;

import tree.code104.Java104;

/**
 * 98. 验证二叉搜索树
 *
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 *
 * 有效 二叉搜索树定义如下：
 *
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路：递归。通过题意可知我们要判断字树中所有的节点是否都在（down,up）的范围内。
 * 由此可得出递归函数dfs(TreeNode node,long down,long up)，在左子树时上界是node.val，
 * 在柚子树是下界是node.val.需要注意的是由于改题数值卡边界，Integer.MAXVALUE不适用，
 * 要改成Long.MAXVALUE
 *
 */

public class Java98 {
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



    public boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode node,long down,long up){
        if (node != null){
            if (node.val >= up || node.val <= down){
                return false;
            }
            return dfs(node.left,down,node.val) && dfs(node.right,node.val,up);
        }
        return true;

    }

    public static void main(String[] args) {
        new Java98().isValidBST(new TreeNode(2,new TreeNode(1),new TreeNode(3)));
    }
}
