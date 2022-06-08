package lc100.dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/word-break/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-10 15:50
 * 这里的dp有一个提前剪枝的操作。是因为对于一维dp[]，也用了O(n^2)的遍历，若提前有dp[n] == true，便返回。
 */
public class Hot139_单词拆分_dp {
    @Test
    public void wordBreak(){
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        boolean[] dp = new boolean[s.length()+1]; //1.dp数组含义：dp[i]表示s[1,i]是否可以被字典组成。
        dp[0] = true; //2.dp数组初始化（边界条件）。dp[0]表示空字符。
        for (int i = 0; i < s.length(); i++) {
            if(dp[i] == true){
                for (int j = i+1; j < s.length()+1; j++) {
                    if(wordDict.contains(s.substring(i,j))){  //注意因为dp[0]代表的是空字符串。而实际s[0]是第一个字符。
                        dp[j] = true;
                        if(j == s.length()){  //提前剪枝
                            System.out.println(true);
                        }
                    }
                }
            }
        }
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(dp[i] + "\t");
//        }
//        System.out.println();
        System.out.println(dp[s.length()]);
    }
}
