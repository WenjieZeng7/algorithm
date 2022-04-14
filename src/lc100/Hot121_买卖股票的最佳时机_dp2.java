package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 15:56
 */
public class Hot121_买卖股票的最佳时机_dp2 {
    //和上一个dp思想一致，只不过没有dp[][]
    //这个叫上一个dp，还能记录买卖时间点

    @Test
    public void maxProfit(){
        int[] prices = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE; //最低的买入价格
        int max = 0; //最大的收益
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
            }
            if((prices[i] - min) > max){
                max = prices[i] - min;
            }
        }
        System.out.println(max);
    }
}
