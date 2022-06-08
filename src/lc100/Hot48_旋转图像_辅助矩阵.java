package lc100;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/rotate-image/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-06 22:43
 * n*n 顺时针旋转
 */
public class Hot48_旋转图像_辅助矩阵 {
    @Test
    public void rotate(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;

        // 辅助矩阵
        int[][] matrix2 = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix2[n-1-j][i];
            }
        }
    }
}
/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗：40.3 MB, 在所有 Java 提交中击败了33.23% 的用户
 */
