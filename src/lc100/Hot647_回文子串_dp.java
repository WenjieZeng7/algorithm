package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/palindromic-substrings/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 22:18
 * dp[i][j]表示 i 到 j 的字符串能不能构成回文串,那么dp[i][j] = dp[i +1][j - 1] && (s[i] == s[j])
 */
public class Hot647_回文子串_dp {
    @Test
    public void countSubstrings(){
        String s = "aaa";
        int result = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        //4.遍历顺序。根据3状态转移公式，应该要从下到上，从左到右进行遍历。
        for (int i = s.length()-1; i >=0  ; i--) { //从下到上
            for (int j = i; j < s.length(); j++) {  //从左到右
                if(i == j){
                    dp[i][j] = true; //情况1:1个字母
                }else if(j - i == 1 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true; //情况2:2个字母
                }else{
                    dp[i][j] = dp[i+1][j-1] && (s.charAt(i) == s.charAt(j)); //其他情况
                }
                if(dp[i][j] == true){
                    result ++;
                }
            }

        }
        System.out.println(result);
        //5.打印dp数组进行检查
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
