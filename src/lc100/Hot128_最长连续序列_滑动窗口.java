package lc100;

import org.junit.Test;
import org.omg.CORBA.RepositoryIdHelper;

import java.util.Arrays;
import java.util.Map;

/**
 * https://leetcode.cn/problems/longest-consecutive-sequence/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-10 15:24
 * 滑动窗口[left,right]双闭区间，表示区间内的值连续
 * 对于要去重的，都可以用set集合。官方题解就是用的set哈希表，但是结果没有我这种朴素的循环快。嘿嘿。
 */
public class Hot128_最长连续序列_滑动窗口 {
    @Test
    public void longestConsecutive(){
        int[] nums = {1,2,0,1};
        if(nums.length == 0){
            System.out.println(0);
            return;
        }
        Arrays.sort(nums);
        int max = 0; //暂存最大值
        int left=0,right =1;
        int temp = 0; //记录[left,right]中有多少个重复的,即如这里写的示例[0,1,1,2]
        for (;  right < nums.length; right++) {
            if(nums[right]-nums[right-1] == 0){
                temp++;
            }
            if(nums[right]-nums[right-1] > 1){
                max = Math.max(max,right-left-temp);
                left = right;
                temp = 0; //改变left起始位置时，temp重置为0。
            }
        }
        max = Math.max(max,right-left-temp);  //这里记录一直连续到最后的情况
        System.out.println(max);
    }
}
/**
 * 执行用时：11 ms, 在所有 Java 提交中击败了96.70% 的用户
 * 内存消耗：47 MB, 在所有 Java 提交中击败了97.96% 的用户
 */
