package lc100.dp;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-03 17:25
 */
public class Hot309_最佳买卖股票时机含冷冻期_dp {
    //卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
    //和Hot121的不同在于，这个是反复购买，所以收益是累计收益。

    /**
     * dp[i][j]:表示第i天结束之后的「**累计**最大收益」
     *      dp[i][0]:目前持有一支股票
     *      dp[i][1]:目前不持有任何股票，**明天**处于冷冻期中，即今天卖的
     *      dp[i][2]:目前不持有任何股票，**明天**不处于冷冻期中
     */
    @Test
    public void maxProfit(){
        int[] prices = {1,2,3,0,2};
        if(prices.length <= 1){
            System.out.println(0);
            return;
        }
        int[][] dp = new int[prices.length][3];
        dp[0][0] = - prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2] - prices[i]);
            dp[i][1] = dp[i-1][0] + prices[i];
            dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]);
        }
        System.out.println(Math.max(dp[prices.length-1][1],dp[prices.length-1][2]));
    }
}
