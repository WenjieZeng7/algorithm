package lc100;

import org.junit.Test;

import javax.swing.text.AbstractDocument;

/**
 * https://leetcode.cn/problems/sort-colors/
 *
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-07 14:50
 * 原地排序
 * 仅使用常数空间的一趟扫描算法
 */
public class Hot75_颜色分类_指针 {
    @Test
    public void sortColors() {
        // 扫描一遍，是0则放到首部，是2则放到尾部
        int[] nums = {2,1,2};
        int p0 = 0; // 指向0的指针
        int p2 = nums.length - 1;  // 指向2的指针
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[p0];
                nums[p0] = 0;
                p0++;
            } else if (nums[i] == 2) {
                if(i > p2){  // 后面全是2了，不用比了。
                    break;
                }
                nums[i] = nums[p2];
                nums[p2] = 2;
                p2--;
                if(nums[i] != 1){  // 如果2换出来的不是1，则还要再换。
                    i--;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗：39.5 MB, 在所有 Java 提交中击败了93.62% 的用户
 */

