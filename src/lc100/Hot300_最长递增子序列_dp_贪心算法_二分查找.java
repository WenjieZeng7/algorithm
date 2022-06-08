package lc100;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/longest-increasing-subsequence/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-25 20:42
 * 不好写for循环，可以用回溯。估计会超时，这里不写了。
 * 题解：https://leetcode.cn/problems/longest-increasing-subsequence/solution/dong-tai-gui-hua-er-fen-cha-zhao-tan-xin-suan-fa-p/
 * 贪心：
 *  已经得到的上升子序列的结尾的数越小，那么遍历的时候后面接上一个数，会有更大的可能构成一个长度更长的上升子序列。
 * 二分：
 *  在有序数组中找一个元素
 * 1.tail[i] 表示：长度为 i + 1 的 所有 上升子序列的结尾的最小值。
 *
 * 二分范式更新一点：最后的结果为left。
 *
 */
public class Hot300_最长递增子序列_dp_贪心算法_二分查找 {
    @Test
    public void lengthOfLIS(){
        int[] nums = {0,1,0,3,2,3};
        int length = nums.length;
        if(length <= 1){
            System.out.println(length);
            return;
        }
        int[] tail = new int[nums.length];
        int index = 0; //表示tail已使用的长度
        tail[0] = nums[0];
        for (int i = 1; i <length ; i++) {
            if(nums[i] > tail[index]){
                //如果nums[i]比tail末位元素大，则直接加入tail中
                index ++;
                tail[index] = nums[i];
            }else if(nums[i] < tail[index]){
                // 使用二分查找法，在有序数组 tail 中，找到第 1 个大于等于 nums[i] 的元素，更改为nums[i]
                int left = 0;
                int right = index;
                while(left <= right){ //二分范式1：<=
                    int mid = left + (right - left)/2;
                    if(tail[mid] < nums[i]){
                        left = mid +1;  //二分范式2：±1
                    }else{
                        right = mid -1;
                    }
                }
                tail[left] = nums[i];  //二分范式3：最后的结果为left
            }
        }
        System.out.println(++index);
    }
}
/**
 * 执行用时：2 ms, 在所有 Java 提交中击败了99.66% 的用户
 * 内存消耗：40.7 MB, 在所有 Java 提交中击败了71.25% 的用户
 */

