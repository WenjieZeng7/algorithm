package lc100.树;

/**
 * 工具类
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-14 17:03
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

