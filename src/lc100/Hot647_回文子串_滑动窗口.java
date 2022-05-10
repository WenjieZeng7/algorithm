package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 22:18
 * 时间复杂度有点高
 */
public class Hot647_回文子串_滑动窗口 {
    @Test
    public void countSubstrings(){
        int sum =0;
        String s = "aaa";
        for (int i = 1; i <= s.length(); i++) {  //窗口长度从1到s.length()
            for (int j = 0; j < s.length()+1-i; j++) {
                if(isMatch(s.substring(j,j+i))){
                    sum ++;
                    System.out.println(s.substring(j,j+i));
                }
            }
        }
        System.out.println(sum);
    }

    /**
     * 判断是否是回文串
     * @param s
     * @return
     */
    public boolean isMatch(String s){
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
