package lc100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-11 22:01
 */
public class Hot114_二叉树展开为链表_二叉树的前序遍历 {
    //二叉树的前序遍历
}

/*
class Solution {
    List<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        preTravel(root);
        int i;
        for(i = 0; i < list.size()-1;i++){
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }
    }

    public void preTravel(TreeNode node){
        if(node == null){
            return;
        }
        list.add(node);
        preTravel(node.left);
        preTravel(node.right);
    }
}
 */