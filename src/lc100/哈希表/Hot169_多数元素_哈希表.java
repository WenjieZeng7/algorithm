package lc100.哈希表;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/majority-element/submissions/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 17:42
 */
public class Hot169_多数元素_哈希表 {
    @Test
    public void more(){
        int[] nums = {2,2,1,1,1,2,2};
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int temp = map.get(nums[i]);
            if (temp > nums.length/2){
                System.out.println(nums[i]);
            }
        }
    }
}
