package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 22:18
 * 中心点分为两类：1.单个字符，2.两个连续字符。这样就可以覆盖到所有的子串。
 * 单个字符的长度：len；双个字符的长度：len-1
 */
public class Hot647_回文子串_中心扩展 {
    @Test
    public void countSubstrings(){
        String s = "aaa";
        int result = 0;
        //情况1.单个字符
        for (int i = 0; i < s.length(); i++) {
            int left = i,right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                result ++;
                left --;
                right ++;
            }
        }
        //情况2.双个字符
        for (int i = 0; i < s.length()-1; i++) {
            int left = i,right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                result ++;
                left --;
                right ++;
            }
        }
        System.out.println(result);
    }

}
