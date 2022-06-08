package lc100.dp;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/target-sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-13 17:47
 * 0 <= nums[i] <= 1000，都是正数
 * 01背包问题
 * https://leetcode.cn/problems/target-sum/solution/dai-ma-sui-xiang-lu-494-mu-biao-he-01bei-rte9/
 * 把 nums[] 划分为两个部分 A && B，
 * 对 A 集合内的元素执行 + 操作，对 B 集合内的元素执行 - 操作。所以有 sum(A) - sum(B) = target
 * sum(A) + sum(B) = sum(nums)
 * sum(A) - sum(B) = target
 * sum(A) = target + sum(B)
 * 2 * sum(A) = target + sum(B) + sum(A)
 * sum(A) = (target + sum(nums)) / 2
 *
 * 在以下情况没有方案：①有向下取整的情况：即if ((S + sum) % 2 == 1) return 0; // 此时没有方案
 *                   ②target的绝对值比sum大。
 * 01背包：每个物品只能用一次；不过和之前的【容量为j的背包，最多能装多少】不同的是，这题是【装满有几种方法】
 * dp五步曲：
 * 1.dp含义：dp[j]表示：填满j（包括j）这么大容积的包，有dp[i]种方法。这里只用一维（滚动数组）
 * 2.递推公式：dp[j] += dp[j - nums[i]]
 * 3.初始化：dp[0] = 1，装满容量为0的背包，有1种方法，就是装0件物品。其他情况为dp[j]为0（因为滚动数组）。
 * 4.遍历顺序：i和j的讨论。物品i放外循环，容量j放内循环，且倒序。

 */
public class Hot494_目标和_dp {

    @Test
    public void findTargetSumWays(){
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int target = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if((target + sum) % 2 != 0 || Math.abs(target) > sum){
            System.out.println(0);
        }
        int bagSize = (target + sum)/2;
        int[] dp = new int[bagSize+1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= 0 && j >= nums[i] ; j--) {
                dp[j] += dp[j-nums[i]];
            }
        }
        System.out.println(dp[bagSize]);
    }
}
/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了94.24% 的用户
 * 内存消耗：39.2 MB, 在所有 Java 提交中击败了51.38% 的用户
 */
