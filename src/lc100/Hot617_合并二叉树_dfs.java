package lc100;

import javax.swing.tree.TreeNode;

/**
 * https://leetcode-cn.com/problems/merge-two-binary-trees/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-09 23:16
 */
public class Hot617_合并二叉树_dfs {
    /*
        3个注意点：
            1.对于树，迭代的时候就是要返回*节点*
            2.节点要有val，left，right三个要素
     */

}

/*
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //对于树，迭代返回的就应该是节点
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        TreeNode merged = new TreeNode(root1.val + root2.val);
        merged.left = mergeTrees(root1.left,root2.left);
        merged.right = mergeTrees(root1.right,root2.right);  //要经过这3步才是完全构建了一个节点，下面返回的才是节点。
        return merged; //这个return应该放在最后，如果在上两行的前面的话，则不迭代了。返回在这一层是没跑的。
    }
}
*/
