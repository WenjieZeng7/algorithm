package lc100;

import org.junit.Test;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 17:19
 */
public class hot22_括号生成_回溯字符串特例 {
    List<String> result = new ArrayList<>();
    @Test
    public void brackets(){
        int n = 3;
        String str = "";
        dfs(str,0,0,n);
        System.out.println(result);;
    }

    //回溯，但单层搜索逻辑不同，不再是for()。也要关注1.参数，2.递归终止条件。
    public void dfs(String str,int left,int right,int n){
        if(left == n && right == n){
            result.add(str);
            return;
        }

        //剪枝
        if(left < right){
            return;
        }

        if(left < n){
            //字符串的拼接特性，是**生成一个新对象**，所以不用回溯。
            //若是用的是StringBuilder，则需要回溯，因为只有一个对象。
            dfs(str + "(",left+1,right,n);
        }

        if(right < n){
            dfs(str + ")",left,right+1,n);
        }
    }
}
