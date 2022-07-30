package lc100.滑动窗口;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/longest-palindromic-substring/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-10 17:43
 */
public class Hot5_最长回文子串_滑动窗口 {
    @Test
    public void longestPalindrome(){
        String s = "babad";
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length()-i; j++) {
                String substring = s.substring(j, j + i);
                if(isMatch(substring)){
                    System.out.println(substring);
                    return;
                }
            }
        }

    }

    /**
     * 判断是否是回文
     * @param s
     * @return
     */
    private boolean isMatch(String s) {
        if(s.length() == 1){
            return true;
        }
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
/*
执行用时：941 ms, 在所有 Java 提交中击败了5.01% 的用户
内存消耗：41.8 MB, 在所有 Java 提交中击败了52.54% 的用户
 */
