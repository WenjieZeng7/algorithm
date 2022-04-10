package lc100;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/minimum-path-sum/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 20:29
 */
public class hot64_最小路径和_dp {
    //1.dp[i][j]表示从起始点到grid[i][j]所走的最小路径和
    //2.①第一行，②第一列，③非第一行&非第一列，不同的状态转移公式
    //3.需要对dp[0][0]初始化
    //4.先列后行遍历
    @Test
    public void pathMin(){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 && j == 0){
                    continue;
                }
                if(i == 0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                    continue;
                }
                if(j == 0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                    continue;
                }
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j]) + grid[i][j];
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
