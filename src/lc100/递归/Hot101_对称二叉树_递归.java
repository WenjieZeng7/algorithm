package lc100.递归;

/**
 * https://leetcode-cn.com/problems/symmetric-tree/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 15:40
 */
public class Hot101_对称二叉树_递归 {

}

/*
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMatch(root.left,root.right);
    }

    public boolean isMatch(TreeNode left,TreeNode right){
        if(left ==null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return (left.val== right.val)&&isMatch(left.left,right.right)&&isMatch(left.right,right.left);
    }
}
 */
