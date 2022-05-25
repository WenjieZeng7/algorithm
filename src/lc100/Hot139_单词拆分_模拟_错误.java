package lc100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/word-break/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-10 15:50
 * 超时，而且没有考虑到s="aaaa"，wordDict=["a","aa"...]这种
 */
public class Hot139_单词拆分_模拟_错误 {
    @Test
    public void wordBreak(){
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        while(s.length() > 0){
            for (int i = 0; i < wordDict.size(); i++) {
                if(s.startsWith(wordDict.get(i))){
                    s = s.substring(wordDict.get(i).length());
                    break;
                }
                if(i == wordDict.size()){
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);
    }
}
