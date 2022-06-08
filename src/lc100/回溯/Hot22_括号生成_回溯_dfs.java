package lc100.回溯;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/generate-parentheses/
 * 使用StringBuilder比String快！
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 17:19
 */
public class Hot22_括号生成_回溯_dfs {
    List<String> result = new ArrayList<>();
    @Test
    public void brackets(){
        int n = 3;
        StringBuilder sb = new StringBuilder();
        dfs(sb,0,0,n);
        System.out.println(result);;
    }

    //回溯，但单层搜索逻辑不同，不再是for()。也要关注1.参数，2.递归终止条件。
    public void dfs(StringBuilder sb,int left,int right,int n){
        if(left == n && right == n){
            result.add(sb.toString());
            return;
        }

        //不符合条件的，进行剪枝。及必须'(' >= ')'
        if(left < right){
            return;
        }

        if(left < n){
            sb.append('(');
            dfs(sb,left+1,right,n);
            sb.deleteCharAt(sb.length() -1);
        }

        if(right < n){
            sb.append(')');
            dfs(sb,left,right+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }



}
