package lc100;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/subarray-sum-equals-k/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-12 22:51
 * 子数组是连续的
 */
public class Hot560_和为K的子数组_前缀和_哈希表 {
    @Test
    public void subarraySum(){
        int[] nums = {1,2,3};
        int k = 3;
        int result = 0;

        // pre[i]表示nums[0]连续到nums[i]的和
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i-1] + nums[i];
        }

        // pre[i]-pre[j-1]代表从[nums[j],nums[i]]之间的和
        // 即求pre[i]-pre[j-1] == k 的个数，这不就转换成了两数之和嘛
        Map<Integer,Integer> map = new HashMap<>();
        // 以和为键，出现次数为对应的值
        map.put(0,1); // 注意！
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(pre[i] - k)){
                result += map.get(pre[i] - k);
            }
            map.put(pre[i],map.getOrDefault(pre[i],0)+1);
        }
        System.out.println(result);
    }
}
/*
执行用时：18 ms, 在所有 Java 提交中击败了96.32% 的用户
内存消耗：44.5 MB, 在所有 Java 提交中击败了26.80% 的用户
 */
