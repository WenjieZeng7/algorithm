package lc100.dfs_bfs;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 23:12
 */
public class Hot102_二叉树的层序遍历_bfs {
    //bfs要用queue队列这个数据结构
    //dfs其实在递归的时候，隐式地用了stack栈。
}

/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();  //结果集
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<>();  //每一层的结果。每一层都要**新建**，因为是对象，如果重复使用，最后的result里面的结果都是一样的list。
            for(int i = 0;i < n; i ++){
                TreeNode node = queue.poll();
                level.add(node.val);  //在出栈时加入到结果中
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
 */

