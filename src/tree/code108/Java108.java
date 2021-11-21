package tree.code108;

import tree.code102.Java102;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Java108 {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums,0,nums.length-1);
    }

    private TreeNode dfs(int[] nums,int left,int right){
        if (left > right){
            return null;
        }
        int mid = (left + right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums,left,mid-1);
        node.right = dfs(nums,mid+1,right);
        return node;
    }
}
