package lc100.dp;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/unique-paths/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 21:06
 */
public class Hot62_不同路径_dp {
    //1.dp[i][j]表示从起始点到grid[i][j]的路径数
    //2.①第一行，②第一列，③非第一行&非第一列，不同的状态转移公式
    //3.需要对二维数组的第一行及第一列进行初始化
    //4.先列后行遍历
    @Test
    public void pathNum(){
        int m = 10;
        int n = 10;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
