package lc100;

import javafx.scene.paint.Material;
import org.junit.Test;

/**
 * https://leetcode.cn/problems/maximal-square/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-26 21:15
 *
 * dp[i][j]表示以该元素作为正方形右下角的正方形边长。
 * 面积 = 边长*边长
 */
public class Hot221_最大正方形_dp {
    @Test
    public void maximalSquare(){
//        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
//        char[][] matrix = {{'0','0','0','1'},{'1','1','0','1'},{'1','1','1','1'},{'0','1','1','1'},{'0','1','1','1'}};
        char[][] matrix = {{'1','1','1','0','0'},{'1','1','1','0','0'},{'1','1','1','1','1'},{'0','1','1','1','1'},{'0','1','1','1','1'},{'0','1','1','1','1'}};
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if((j== 0 || i== 0) && matrix[i][j] == '1'){
                    dp[i][j] = 1;
                }else if(matrix[i][j] == '1') {
                    if(dp[i-1][j-1] > 0 && dp[i][j-1] > 0 && dp[i-1][j] > 0){
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]) +1; // 状态转移方程
                    }else{
                        dp[i][j] = 1;
                    }
                }
                max = Math.max(max,dp[i][j]);
                System.out.print(dp[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println(max*max);
    }
}
