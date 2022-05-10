package lc100;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/kth-largest-element-in-an-array/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-09 13:52
 */
public class Hot215_数组中的第K个最大元素_调库 {
    @Test
    public void findKthLargest(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}
