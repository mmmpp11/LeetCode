package tree.code102;

import tree.code98.Java98;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * 解题思路：bfs
 */

public class Java102 {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> treeNodes = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()){
            int size = treeNodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++){
                TreeNode node = treeNodes.poll();
                list.add(node.val);
                if (node.left != null){
                    treeNodes.add(node.left);
                }
                if (node.right != null){
                    treeNodes.add(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
     }
}
