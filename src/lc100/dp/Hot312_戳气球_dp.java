package lc100.dp;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/burst-balloons/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 15:51
 * 下面的题解是真的牛
 * 题解：https://leetcode-cn.com/problems/burst-balloons/solution/dong-tai-gui-hua-tao-lu-jie-jue-chuo-qi-qiu-wen-ti/
 * 画二维的dp table出来就很好看
 * 与传统的dp不同的在于，每一次会改变原数组
 */

public class Hot312_戳气球_dp {
    @Test
    public void maxCoins() {
        int[] nums = {3, 1, 5, 8};
        //添加两侧的虚拟气球: nums[-1] = nums[n] = 1
        int n = nums.length;
        int[] points = new int[n+2];
        points[0] = points[n+1] = 1;
        for (int i = 1; i <= n; i++) {
            points[i] = nums[i-1];
        }

        //题意变为: 气球的索引变成了从 1 到 n，points[0] 和 points[n+1] 可以认为是两个「虚拟气球」。
        //1.dp数组定义及下标含义：
        //  dp[i][j] = x 表示，戳破气球 i 和气球 j 之间（**开区间**，不包括 i 和 j）的所有气球，可以获得的最高分数为 x。
        int[][] dp = new int[n+2][n+2]; //4.初始化都是0
        //3.遍历方式：是二维的dp table，从下到上从左往右遍历
        for (int i = n; i >=0 ; i--) { //从下到上
            for (int j = i+1; j <= n+1 ; j++) {  //从左到右
                for (int k = i+1; k < j; k++) {  //选择
                    //2.状态转移方程：
                    //最后戳破气球 k ,那得先把开区间 (i, k) 的气球都戳破，再把开区间 (k, j) 的气球都戳破；
                    //最后剩下的气球 k，相邻的就是气球 i 和气球 j，这时候戳破 k 的话得到的分数就是 points[i]*points[k]*points[j]。
                    dp[i][j] = Math.max(dp[i][j],dp[i][k] + dp[k][j] + points[i]*points[j]*points[k]); //穷举取最大
                }
            }
        }
        //5.打印dp
        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < n+2; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
