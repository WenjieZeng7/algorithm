package lc100;

import org.junit.Test;

import java.util.Arrays;


/**
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-13 23:07
 */


public class Hot105_从前序与中序遍历序列构造二叉树_递归 {
    public static void main(String[] args) {
        int[] perorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        buildTree(perorder,inorder);
    }


    static TreeNode buildTree(int[] preorder, int[] inorder) {  //时间复杂度和空间复杂度有点高。
        //降低空间复杂度的方法，递归函数的参数加入以下index，不用构建新的数组
        // (int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end)

        //降低时间复杂度的话，建立inorder的Map的哈希映射<值，下标>，从而不用每次for循环在中序遍历中找根节点。
        if(preorder.length == 0){
            return null;
        }
        TreeNode head = new TreeNode();
        head.val = preorder[0];
        int i;
        for (i = 0; i < inorder.length; i++) {
            if(inorder[i] == preorder[0]){
                break;
            }
        }
        head.left = buildTree(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
        head.right = buildTree(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        return head;
    }
}


