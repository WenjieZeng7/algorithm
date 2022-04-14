package lc100;

import org.junit.Test;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * 数组可以当哈希表，hashmap也可以当哈希表
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-05 23:35
 */
public class Hot1_两数之和_哈希表 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>(nums.length-1);
        hashMap.put(nums[0],0);
        for (int i = 1; i < nums.length; i++) {
            if(hashMap.containsKey(target-nums[i])){
                result[0] = hashMap.get(target-nums[i]);
                result[1] = i;
            }else {
                hashMap.put(nums[i],i);
            }
        }
    }
}
