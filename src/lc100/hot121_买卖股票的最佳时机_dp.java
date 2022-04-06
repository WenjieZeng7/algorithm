package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 15:56
 */
public class hot121_买卖股票的最佳时机_dp {
    //dp[i][j]：下标为 i 这一天结束的时候，手上持股状态为 j 时,持有的金额。买入-，卖出+，剩下的钱就可以当成是盈利。
    //dp[i][0]：规定了今天不持股，有以下两种情况：
    //    昨天不持股，今天什么都不做；
    //    昨天持股，今天卖出股票（现金数增加），
    //dp[i][1]：规定了今天持股，有以下两种情况：
    //    昨天持股，今天什么都不做（现金数与昨天一样）；
    //    昨天不持股，今天买入股票（注意：只允许交易一次，因此手上的现金数就是当天的股价的相反数）。

    @Test
    public void maxProfit(){
        int[] prices = {7,1,5,3,6,4};
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]); //相当于在最高点卖出
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);  //相当于找到买入的最低点
        }
        System.out.println(dp[prices.length-1][0]);
    }
}
