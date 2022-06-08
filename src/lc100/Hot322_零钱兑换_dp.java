package lc100;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/coin-change/
 *
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-31 11:44
 * <p>
 * 返回所需的 最少的硬币个数
 * <p>
 * 肯定可以用回溯，但是不一定贪心（优先选最大的）是正确的
 */
public class Hot322_零钱兑换_dp {
    @Test
    public void coinChange() {
        int[] coins = {186, 419, 83, 408};
        int amount = 6249;
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    int temp = dp[i - coins[j]];
                    if (temp != -1) {
                        dp[i] = Math.min(dp[i], temp + 1);
                    }
                } else {
                    break;
                }
            }
            if (dp[i] == Integer.MAX_VALUE) {  // 必须加入这个判断，判断是否之前forj完全没有符合的情况才置为-1.
                dp[i] = -1;
            }
        }
        System.out.println(dp[amount]);
    }
}
/**
 * 执行用时：14 ms, 在所有 Java 提交中击败了40.12% 的用户
 内存消耗：40.9 MB, 在所有 Java 提交中击败了60.16% 的用户
 */
