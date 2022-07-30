package lc100;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/longest-palindromic-substring/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-10 17:43
 * 分单个字符和两个字符的扩展
 */
public class Hot5_最长回文子串_中心扩展 {
    @Test
    public void longestPalindrome(){
        String s = "babad";
        int maxLeft=0,maxRight=0, max=0;
        //单个字符
        for (int i = 0; i < s.length(); i++) {
            int left = i,right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left > max){
                    max = right - left;
                    maxLeft = left;
                    maxRight = right;
                }
                left --;
                right ++;
            }
        }

        //两个字符
        //情况2.双个字符
        for (int i = 0; i < s.length()-1; i++) {
            int left = i,right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left > max){
                    max = right - left;
                    maxLeft = left;
                    maxRight = right;
                }
                left --;
                right ++;
            }
        }
        System.out.println(s.substring(maxLeft,maxRight+1));
    }
}
/*
执行用时：29 ms, 在所有 Java 提交中击败了71.24% 的用户
内存消耗：41.4 MB, 在所有 Java 提交中击败了70.99% 的用户
 */
