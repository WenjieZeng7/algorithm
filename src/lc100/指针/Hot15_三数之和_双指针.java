package lc100.指针;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.cn/problems/3sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-10 20:51
 * 题解
 * https://leetcode.cn/problems/3sum/solution/3sumpai-xu-shuang-zhi-zhen-yi-dong-by-jyd/
 */
public class Hot15_三数之和_双指针 {
    List<List<Integer>> result = new ArrayList<>();
    @Test
    public void threeSum(){
        int[] nums = {0,0,0,0,0};
        Arrays.sort(nums); // 从小到大排序
        for (int k = 0; k < nums.length -2; k++) {
            if(nums[k] > 0){
                break;  // 因为nums[]已经排序了
            }
            if(k > 0 && nums[k] == nums[k-1]){
                continue; // 避免第一个元素nums[k]重复
            }
            int i = k+1, j=nums.length-1;
            while (i<j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    while(i < j && nums[i] == nums[++i]); // 排除第2个重复元素
                }else if(sum > 0){
                    while (i< j && nums[j] == nums[--j]); // 排除第3个重复元素
                }else{ // sum == 0
                    result.add(new ArrayList<>(Arrays.asList(nums[k],nums[i],nums[j])));
                    // 下面这里也用上面的方法，可以避免往result[]中加入重复的list
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
    }
}
/*
执行用时：24 ms, 在所有 Java 提交中击败了36.42% 的用户
内存消耗：44.9 MB, 在所有 Java 提交中击败了94.83% 的用户
 */
