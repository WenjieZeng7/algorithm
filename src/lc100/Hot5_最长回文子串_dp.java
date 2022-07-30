package lc100;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/longest-palindromic-substring/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-10 17:43
 * 这里只要找最大的，不用分1个或2个字母。
 */
public class Hot5_最长回文子串_dp {
    @Test
    public void longestPalindrome(){
        String s = "cbbd";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLeft=0,maxRight=0, max=0;
        for (int left = s.length()-1 ; left >= 0; left--) {
            for (int right = left ; right < s.length(); right++) {
                if(s.charAt(left) == s.charAt(right) && (right - left <=2 || dp[left+1][right-1])){
                    // 直接用right - left <= 2。讨论了中心扩展中1个字符和2个字符的问题。
                    dp[left][right] = true;
                    if(right - left > max){
                        max = right - left;
                        maxLeft = left;
                        maxRight = right;
                    }
                }
            }
        }
        System.out.println(s.substring(maxLeft,maxRight+1));
    }
}
/*
执行用时：207 ms, 在所有 Java 提交中击败了27.01% 的用户
内存消耗：46.3 MB, 在所有 Java 提交中击败了6.23% 的用户
 */
