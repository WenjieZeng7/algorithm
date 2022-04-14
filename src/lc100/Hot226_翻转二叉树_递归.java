package lc100;

import javax.swing.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 17:27
 */
public class Hot226_翻转二叉树_递归 {

}

/*
class Solution {
    public TreeNode invertTree(TreeNode root) {
        change(root);
        return root;
    }

    public void change(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        change(node.left);
        change(node.right);
    }
}
*/