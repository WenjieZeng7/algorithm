package lc100.数学;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/rotate-image/
 *
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-06 22:43
 * n*n 顺时针旋转
 * 顺时针旋转 = 沿左上右下对角线翻转 + 每行左右翻转
 */
public class Hot48_旋转图像_两次翻转 {
    @Test
    public void rotate() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        // 沿左上右下对角线翻转
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }

        // 每行左右翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗：39.6 MB, 在所有 Java 提交中击败了99.43% 的用户
 */
