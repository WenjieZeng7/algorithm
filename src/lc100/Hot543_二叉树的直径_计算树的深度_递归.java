package lc100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-09 23:20
 */
public class Hot543_二叉树的直径_计算树的深度_递归 {
}

/*
class Solution {
    int out = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return out;
    }

    //计算树的最大深度+一个临时变量存储最大值
    public int depth(TreeNode node){
        if(node == null){
            return 0;
        }else{
            int left = depth(node.left);
            int right = depth(node.right);
            out = Math.max(left+right,out);  //这一行就是临时存储的最大值，除去这一行的其他代码，就是计算树的最大深度。
            return Math.max(left,right)+1;
        }
    }
}
 */
