package lc100.哈希表;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/find-the-duplicate-number/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-14 17:58
 */
public class Hot287_寻找重复数_哈希表 {
    //这个方法的额外空间复杂度**不是**O(1)
    @Test
    public void getSame(){
        int[] nums = {1,3,4,2,2};
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                System.out.println(nums[i]);
            }else{
                map.put(nums[i],1);
            }
        }
    }
}
