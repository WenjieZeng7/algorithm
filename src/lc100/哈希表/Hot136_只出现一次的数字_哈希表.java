package lc100.哈希表;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/single-number/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 16:55
 */
public class Hot136_只出现一次的数字_哈希表 {
    @Test
    public void onlyOne(){
        int[] nums = {4,1,2,1,2};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); // 如果没有则赋值为0，再加上1。
        }
        Set<Integer> keySet = map.keySet();
        for(Integer i : keySet){
            if (map.get(i) == 1){
                System.out.println(i);
            }
        }
    }
}
