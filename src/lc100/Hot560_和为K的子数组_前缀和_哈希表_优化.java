package lc100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/subarray-sum-equals-k/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-12 22:51
 * 子数组是连续的
 * 优化：
 * 不用单独的一次遍历来获得pre[]
 */
public class Hot560_和为K的子数组_前缀和_哈希表_优化 {
    @Test
    public void subarraySum(){
        int[] nums = {1,2,3};
        int k = 3;
        int result = 0;
        int pre = 0;

        // pre[i]-pre[j-1]代表从[nums[j],nums[i]]之间的和
        // 即求pre[i]-pre[j-1] == k 的个数，这不就转换成了两数之和嘛
        Map<Integer,Integer> map = new HashMap<>();
        // 以和为键，出现次数为对应的值
        map.put(0,1); // 注意！
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i]; // 在每次循环中进行运算，重复运用
            if(map.containsKey(pre - k)){
                result += map.get(pre - k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        System.out.println(result);
    }
}
/*
执行用时：22 ms, 在所有 Java 提交中击败了66.65% 的用户
内存消耗：45.9 MB, 在所有 Java 提交中击败了5.01% 的用户
 */
