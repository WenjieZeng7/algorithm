package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 15:18
 */
public class hot53_最大子数组和_dp {
    //dp[i]表示以num[i] *结尾* 的 *连续* 子数组的最大和
    @Test
    public void dynamicProgramming(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if(dp[i-1] < 0){
                dp[i] = nums[i];
            }else{
                dp[i] = dp[i-1] + nums[i];
            }
            if(dp[i] > max){ //同时进行最大值判断，增加效率
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}
