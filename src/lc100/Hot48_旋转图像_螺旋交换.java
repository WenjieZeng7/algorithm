package lc100;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/rotate-image/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-06 22:43
 * n*n 顺时针旋转
 * 题解：
 * https://leetcode.cn/problems/rotate-image/solution/li-kou-48xiao-bai-du-neng-kan-dong-de-fang-fa-zhu-/
 * 左上角坐标为(pos1,pos1)，右下角坐标为(pos2,pos2)
 */
public class Hot48_旋转图像_螺旋交换 {
    @Test
    public void rotate(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        int pos1 = 0;
        int pos2 = n-1;
        int add; // 偏移量
        int temp; // 临时变量，用于每一次螺旋交换
        while (pos1 < pos2){ // 控制层级
            add = 0; // 每次置0
            while(add < pos2 - pos1){  //控制每层
                temp = matrix[pos1][pos1+add];
                matrix[pos1][pos1+add] = matrix[pos2-add][pos1]; // 左上角
                matrix[pos2-add][pos1] = matrix[pos2][pos2-add]; // 左下角
                matrix[pos2][pos2-add] = matrix[pos1+add][pos2]; // 右下角
                matrix[pos1+add][pos2] = temp; // 右上角
                add ++;
            }
            pos1 ++;
            pos2 --;
        }
    }
}
/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗：39.8 MB, 在所有 Java 提交中击败了92.88% 的用户
 */
