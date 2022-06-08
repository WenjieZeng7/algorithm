package lc100.dp;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/jump-game/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-03 17:51
 */
public class Hot55_跳跃游戏_dp {
    //dp[i]：表示到这个位子之后还能走的最大格数
    @Test
    public void canJump(){
        int[] nums = {2,3,1,1,4};
        if(nums[0] == 0 && nums.length > 1){
            System.out.println("false");
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]-1,nums[i]);
            if(dp[i] == 0 && i < nums.length-1){
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
