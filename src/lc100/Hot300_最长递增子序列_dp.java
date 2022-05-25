package lc100;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/longest-increasing-subsequence/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-25 20:42
 * 不好写for循环，可以用回溯。估计会超时，这里不写了。
 * 题解：https://leetcode.cn/problems/longest-increasing-subsequence/solution/dong-tai-gui-hua-er-fen-cha-zhao-tan-xin-suan-fa-p/
 * 1.转态定义。dp[i]表示**以nums[i]结尾**的递增自序列长度
 */
public class Hot300_最长递增子序列_dp {
    //返回长度
    @Test
    public void lengthOfLIS(){
        int[] nums = {10,9,2,5,3,7,101,18};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);  //2.所有都初始化为1,每一个数都有可能是最长子序列的起点。
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j])
                dp[i] = Math.max(dp[i],dp[j] + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            if(dp[i] > res){
                res = dp[i];
            }
        }
        System.out.println(res);
    }
}
/**
 * 执行用时：55 ms, 在所有 Java 提交中击败了71.33% 的用户
 * 内存消耗：40.7 MB, 在所有 Java 提交中击败了74.63% 的用户
 */
