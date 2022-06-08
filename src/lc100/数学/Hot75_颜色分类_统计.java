package lc100.数学;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/sort-colors/
 *
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-07 14:50
 * 原地排序
 * 仅使用常数空间的一趟扫描算法
 */
public class Hot75_颜色分类_统计 {
    @Test
    public void sortColors() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n0++;
            } else if (nums[i] == 1) {
                n1++;
            } else {
                n2++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < n0) {
                nums[i] = 0;
            } else if (i < n0 + n1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗：39.9 MB, 在所有 Java 提交中击败了36.37% 的用户
 */
